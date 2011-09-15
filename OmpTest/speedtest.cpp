#include <iostream>

int main(int argc, char** argv) {
  const int SIZE = 100000000;
  int* a = new int[SIZE];
  int* b = new int[SIZE];
  int* c = new int[SIZE];

  for(int i = 0; i < SIZE; i++) {
    a[i] = b[i] * c[i];
  }    

  // prevent GCC from optimizing out the loop
  std::cout << "a[" << (SIZE-1) << "]=" << a[SIZE-1] << std::endl;

  for(int i = 0; i < SIZE; i++) {
    a[i] = b[i] + c[i] + 1;
  }    

  // prevent GCC from optimizing out the loop
  std::cout << "a[" << (SIZE-1) << "]=" << a[SIZE-1] << std::endl;

  delete[] a;
  delete[] b;
  delete[] c;

  return 0;
}
