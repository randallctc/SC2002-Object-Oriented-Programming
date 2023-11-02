#include <iostream>
#include <string>
#include "Animal.h"
using namespace std;
Animal::Animal(): _name("unknown"){
    cout<<"Constructing Animal object "<<_name<<endl;
}

Animal::Animal(string name, COLOR color):_name(name), _color(color){
    cout<<_name<<" is an animal that is "<<colorNames[_color]<<" in color."<<endl;
}

Animal::~Animal(){
    cout<<"Destructing Animal object "<<_name<<endl;
}

Mammal::Mammal() : Animal() {}

Mammal::Mammal(string name, COLOR color):Animal(name, color){}

Mammal::~Mammal() = default;

void Mammal::speak() const{
    cout<<"Mammal growl."<<endl;
}

void Mammal::eat() const {
    cout <<"Mammal eat." <<endl ;
}

void Mammal::move() const{
    cout<<"Mammal move."<<endl;
}