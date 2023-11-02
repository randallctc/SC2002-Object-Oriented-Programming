#include <iostream>
#include <string>
#include "Animal.h"
#include "ChildAnimal.h"
const int MAX = 10;
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