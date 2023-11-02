#include <iostream>
#include <string>
using namespace std;
const int MAX = 10;
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

int main(){
    Mammal *mammals[MAX];
    int choice = 0;
    int i = 0;
    while(choice<5){
        cout<<"Select the animal to send to zoo."<<endl;
        cout<<"(1) Dog"<<endl;
        cout<<"(2) Cat"<<endl;
        cout<<"(3) Lion"<<endl;
        cout<<"(4) Move all animals"<<endl;
        cout<<"(5) Quit"<<endl;
        cout<<"Enter choice: ";
        cin >> choice;
        if(i >= 10){
            cout<<"Zoo is full."<<endl;
            break;
        }
        switch(choice){
            case 1:
                mammals[i] = new Dog("Dog", COLOR(4), "Dog Owner");
                i++;
                break;
            case 2:
                mammals[i] = new Cat("Cat", COLOR(4));
                i++;
                break;
            case 3:
                mammals[i] = new Lion("Lion", COLOR(4));
                i++;
                break;
            case 4:
                for (auto &mammal : mammals) {
                    mammal->move();
                    mammal->speak();
                    mammal->eat();
                }
                break;
            case 5:
                cout << "Exiting the program." << endl;
                break;
            default:
                break;
        }
    }
    for (int j = 0; j < i; j++) {
        delete mammals[j];
    }
    return 0;
}