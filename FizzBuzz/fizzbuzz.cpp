#include <iostream>

int main(int argc, char** argv) {

  for(int i = 1; i <= 100; i++) {
    /*
    if(i % 3 == 0)
      std::cout << "Fizz";
    if(i % 5 == 0)
      std::cout << "Buzz";
    if(i % 3 != 0 && i % 5 != 0)
      std::cout << i;
    std::cout << std::endl;
    */
    
    if(i % 3 == 0 && i % 5 == 0)
      std::cout << "FizzBuzz (" << i << ")" << std::endl;
    else if(i % 5 == 0)
      std::cout << "Buzz (" << i << ")" << std::endl;
    else if(i % 3 == 0)
      std::cout << "Fizz (" << i << ")" << std::endl;
    else
      std::cout << i << std::endl;
    
  }


  return 0;
}
