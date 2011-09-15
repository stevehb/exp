#include <omp.h>
#include <iostream>

int main(int argc, char** argv) {
  const int SIZE = 100000000;
  int* a = new int[SIZE];
  int* b = new int[SIZE];
  int* c = new int[SIZE];

  std::cout << "There are " << omp_get_num_procs() << " procs." << std::endl;

  #pragma omp parallel
  {
    #pragma omp for
    for(int i = 0; i < SIZE; i++) {
      a[i] = b[i] * c[i];
    }    
  }

  std::cout << "a[" << (SIZE-1) << "]=" << a[SIZE-1] << std::endl;

  #pragma omp parallel
  {
    #pragma omp for
    for(int i = 0; i < SIZE; i++) {
      a[i] = b[i] + c[i] + 1;
    }    
  }

  std::cout << "a[" << (SIZE-1) << "]=" << a[SIZE-1] << std::endl;

  delete[] a;
  delete[] b;
  delete[] c;

  return 0;
}
