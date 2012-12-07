#include <omp.h>
#include <iostream>

int main(int argc, char** argv) {
  std::cout << "There are " << omp_get_num_procs() << " procs." << std::endl;
  #pragma omp parallel
  {
    int tid = omp_get_thread_num();
    
    //#pragma omp critical
    //{
      std::cout << "\tcore " << tid << std::endl;
    //}
  }
  return 0;
}
