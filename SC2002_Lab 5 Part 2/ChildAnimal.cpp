#include "ChildAnimal.h"
#include <iostream>
#include <string>
using namespace std;
Dog::Dog(string name, COLOR color, string owner):Mammal(name, color){
    owner = owner;
}

Dog::~Dog() = default;

void Dog::speak() const{
    cout<<"Dog woof."<<endl;
}

void Dog::move() const{
    cout<<"Dog move."<<endl;
}

Cat::Cat(string name, COLOR color):Mammal(name, color){}

Cat::~Cat() = default;

void Cat::speak() const{
    cout<<"Cat meow."<<endl;
}

void Cat::move() const{
    cout<<"Cat move."<<endl;
}

Lion::Lion(string name, COLOR color):Mammal(name, color){}

Lion::~Lion() = default;

void Lion::speak() const{
    cout<<"Lion roar."<<endl;
}

void Lion::move() const{
    cout<<"Lion move."<<endl;
}