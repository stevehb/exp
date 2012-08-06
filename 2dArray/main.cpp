#include <algorithm>
#include <iostream>

const int NROWS = 100;
const int NCOLS = 100;

int main(int argc, char** argv) {

  std::cout << "Allocating 2d array for " << NROWS << " by " << NCOLS << " cols" << std::endl;
  double** m = new double*[NROWS];
  m[0] = new double[NROWS * NCOLS];
  for(int i = 1; i < NROWS; i++) {
    m[i] = m[i-1] + NCOLS;
  }

  std::cout << "Zeroing the memory" << std::endl;
  std::fill_n(&(m[0][0]), NROWS * NCOLS, 0.0);

  std::cout << "And freeing it again" << std::endl;
  delete[] m[0];
  delete[] m;

  return 0;
}
