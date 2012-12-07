#include <stdio.h>

int main(void) {
  int i, j;
#pragma omp parallel for
  for(i=0;i<4;i++) {
    j = 0;
    printf("for loop, thread=%d\n", omp_get_thread_num());
    while(j < 10000) { j++; };
    printf("for loop, thread=%d, j=%d\n", omp_get_thread_num(), j);
  }  
  return 0;
}
