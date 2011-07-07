#include <iostream>
using namespace std;

class AClass {
private:
  int a;
  
public:
  AClass (int a_) : a(a_) {  
    cout << " constructor AClass(int) " << a << endl;
  }
  
  AClass(const AClass& x) : a(x.a) { 
    cout << " copy constructor AClass(const AClass &) " << a << endl;
  }
  
  AClass& operator=(const AClass& x) { 
    a = x.a;
    cout << "AClass& operator=(const AClass &) " << a << endl;
    return *this;
  }
};

AClass g () {
  AClass *x = new AClass(8);
  return (*x);
}

int main () {
  cout << " before AClass b = g() " << endl;
  AClass b = g();
  cout << " after" << endl;
  
  cout << " before AClass c(g()) " << endl;
  AClass c  (g());
  cout << " after" << endl;
}
