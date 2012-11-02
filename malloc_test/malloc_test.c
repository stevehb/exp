#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
  printf("before\n");
  int i = 0;
  void *tmp;
  while(1) {
    tmp = malloc(1 << 10);
    if(tmp == 0) {
      printf("tmp == 0\n");
      break;
    }
    //printf("allocated %d KB\n", ++i);
  }
  printf("after\n");

  return 0;
}
