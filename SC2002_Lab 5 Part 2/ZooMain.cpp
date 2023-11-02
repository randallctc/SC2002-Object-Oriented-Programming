#include <iostream>
#include <string>
#include "Animal.h"
#include "ChildAnimal.h"
const int MAX = 10;
int main(){
    Mammal *mammals[MAX];
    int choice = 0;
    string name;
    string owner;
    int color;
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
                cout<<"Input name of dog: ";
                cin >> name;
                cout<<"(1) Green \n(2) Blue\n(3) White\n(4) Black\n(5) Brown\nChoose color of dog: ";
                cin >> color;
                cout<<"Input name of owner of dog: ";
                cin >> owner;
                if(color > 5 || color < 1){
                    cout<<"Invalid choice"<<endl;
                    break;
                }
                mammals[i] = new Dog(name, COLOR(color-1), owner);
                i++;
                break;
            case 2:
                cout<<"Input name of cat: ";
                cin >> name;
                cout<<"(1) Green \n(2) Blue\n(3) White\n(4) Black\n(5) Brown\nChoose color of cat: ";
                cin >> color;
                if(color > 5 || color < 1){
                    cout<<"Invalid choice"<<endl;
                    break;
                }
                mammals[i] = new Cat(name, COLOR(color-1));
                i++;
                break;
            case 3:
                cout<<"Input name of lion: ";
                cin >> name;
                cout<<"(1) Green \n(2) Blue\n(3) White\n(4) Black\n(5) Brown\nChoose color of lion: ";
                cin >> color;
                if(color > 5 || color < 1){
                    cout<<"Invalid choice"<<endl;
                    break;
                }
                mammals[i] = new Lion(name, COLOR(color-1));
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