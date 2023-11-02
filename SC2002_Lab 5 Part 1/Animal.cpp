#include <iostream>
#include <string>
using namespace std;
enum COLOR {Green, Blue, White, Black, Brown};
const char* colorNames[] = {"Green", "Blue", "White", "Black", "Brown"};
class Animal{
    public :
        Animal(): _name("unknown"){
            cout<<"Constructing Animal object "<<_name<<endl;
        }
        Animal(string name, COLOR color):_name(name), _color(color){
            cout<<_name<<" is an animal that is "<<colorNames[_color]<<" in color."<<endl;
        }
        ~Animal(){
            cout<<"Destructing Animal object "<<_name<<endl;
        }
        virtual void speak() const{
            cout<<_name<<" says hello."<<endl;
        }
        virtual void move() const = 0;
    private:
        string _name;
        COLOR _color;
};

class Mammal:public Animal{
    public:
    Mammal(string name, COLOR color):Animal(name, color){}
    ~Mammal(){}
    void eat() const {
        cout << "Mammal eat." << endl ;
    }
    void move() const{
        cout<<"Mammal walks mammally."<<endl;
    }
};
class Dog:public Mammal{
    public:
    Dog(string name, COLOR color, string owner):Mammal(name, color){
        owner = owner;
    }
    ~Dog(){}
    void speak(){
        cout<<"Woof."<<endl;
    }
    void move(){
        cout<<"Dog walks on fours."<<endl;
    }
    private:
    string owner;
};

int main(){
    Mammal b("Johnathan", COLOR::Brown);
    b.speak();
    b.eat();
    b.move();
    Dog c("Bobby", COLOR::Black, "Jason");
    c.speak();
    c.eat();
    c.move();
    Animal *animalPtr = new Dog("Jacob", Green, "Alexander");
    animalPtr->speak();
    Dog dogi("Lassie", White, "Andy");
    Mammal *aniPtr = &dogi ;
    Mammal &aniRef = dogi ;
    Mammal aniVal = dogi ;
    aniPtr->speak() ;
        aniRef.speak() ;
            aniVal.speak() ;
    delete animalPtr;
    cout<<"Exiting Program"<<endl;
    return 0;
}