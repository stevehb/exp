int main(void) {
  int i;
#pragma omp parallel for
  for(i=0;i<4;i++); // while(1);
  
  return 0;
}
