#ifndef ANIMAL_H
#define ANIMAL_H
#include <iostream>
#include <string>
using namespace std;
enum COLOR {
    Green, Blue, White, Black, Brown
};
const char* colorNames[] = {"Green", "Blue", "White", "Black", "Brown"};
class Animal{
    public :
        Animal();
        Animal(string name, COLOR color);
        ~Animal();
        virtual void speak() const = 0;
        virtual void move() const = 0;
    private:
        string _name;
        COLOR _color;
};

class Mammal:public Animal{
    public:
        Mammal();
        Mammal(string name, COLOR color);
        ~Mammal();
        void speak() const;
        void eat() const;
        void move() const;
};
#endif