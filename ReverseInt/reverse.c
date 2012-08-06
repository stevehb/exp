#include <stdio.h>
#define Success 0

int main() {
  int integer;
  int reverse = 0;
  int digit;

  printf("Enter Integer: \n");
  scanf("%d", &integer);

  /* Reverse the numbers in the integer */
  while (integer != 0) { 
    digit = integer%10;
    reverse = (reverse * 10) + digit;
    integer = integer / 10;
    printf("loop: digit=%d, reverse=%d, integer=%d\n", digit, reverse, integer);
  }

  printf("reverse=%d\n", reverse);

  /* Print the numbers of the reverse integer, in reverse order */
  while (reverse != 0) {
    digit = reverse%10;
    printf("%d\n", digit);
    reverse = reverse / 10;
  }
  
  return Success;
}
