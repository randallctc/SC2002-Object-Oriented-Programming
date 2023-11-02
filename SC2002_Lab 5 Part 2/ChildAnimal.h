#ifndef CHILD_ANIMAL_H
#define CHILD_ANIMAL_H
#include "Animal.h"
using namespace std;
class Dog:public Mammal{
    public:
        Dog(string name, COLOR color, string owner);
        ~Dog();
        void speak() const;
        void move() const;
};

class Cat:public Mammal{
    public:
        Cat(string name, COLOR color);
        ~Cat();
        void speak() const;
        void move() const;
};

class Lion:public Mammal{
    public:
        Lion(string name, COLOR color);
        ~Lion();
        void speak() const;
        void move() const;
};
#endif