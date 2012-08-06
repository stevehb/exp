#include <cstdlib>
#include <iostream>

int main(int argc, char** argv) {

  int N = 1000000;
  int a = std::rand();
  int b = std::rand();

  for(int i = 0; i < N; i++) {
    a ^= b;
    b ^= a;
    a ^= b;
  }
  std::cout << "finished: a=" << a << ", b=" << b << std::endl;

}
