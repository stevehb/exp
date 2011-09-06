#include <iostream>

int main(int argc, char** argv) {
  try {
    // This will cause an exception
    char *p = 0;
    char x = 0;
    std::cout << "about to use null pointer..." << std::endl;
    *p = x; 
    std::cout << "\tused it!" << std::endl;
  }
  catch (...) {
    std::cout << "caught an exception" << std::endl;
    int a = 0;
  }
}
