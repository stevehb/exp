#include <iostream>
#include <time.h>

using namespace std;
size_t dummy;

class SomeObject
{
    public:
        void Operation1();
        void Operation2();
        void Operation3();
        void Operation4();
        void Operation5();
        void Operation6();
};

void SomeObject::Operation1() { for (int i = 1; i < 100; i++) { dummy++; } }
void SomeObject::Operation2() { for (int i = 1; i < 100; i++) { dummy++; } }
void SomeObject::Operation3() { for (int i = 1; i < 100; i++) { dummy++; } }
void SomeObject::Operation4() { for (int i = 1; i < 100; i++) { dummy++; } }
void SomeObject::Operation5() { for (int i = 1; i < 100; i++) { dummy++; } }
void SomeObject::Operation6() { for (int i = 1; i < 100; i++) { dummy++; } }

void Foo1(SomeObject** array, unsigned int size)
{
    for (int i = 0; i < size; i++)
    {
        ((*array) + i)->Operation1();
        ((*array) + i)->Operation2();
        ((*array) + i)->Operation3();
        ((*array) + i)->Operation4();
        ((*array) + i)->Operation5();
        ((*array) + i)->Operation6();
    }
}

void Foo2(SomeObject** array, unsigned int size)
{
    for (int i = 0; i < size; i++)
    {
        SomeObject& obj = *((*array) + i);
        obj.Operation1();
        obj.Operation2();
        obj.Operation3();
        obj.Operation4();
        obj.Operation5();
        obj.Operation6();
    }
}


int main(int argc, char * argv[])
{
    clock_t timer;

    SomeObject * array[100];
    for (int i = 0; i < 100; i++)
    {
        array[i] = new SomeObject();
    }

    timer = clock();
    for (int i = 0; i < 100000; i++) { Foo1(array, 100); }
    cout << "Foo1: " << clock() - timer << endl;

    timer = clock();
    for (int i = 0; i < 100000; i++) { Foo2(array, 100); }
    cout << "Foo2: " << clock() - timer << endl;

    for (int i = 0; i < 100; i++)
    {
        delete array[i];
    }

    return 0;
}

