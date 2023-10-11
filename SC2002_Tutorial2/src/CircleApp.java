import java.util.*;
public class CircleApp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        Circle circle = null;
        do{
            System.out.println("1. Create a new circle");
            System.out.println("2. Print area");
            System.out.println("3. Print circumference");
            System.out.println("4. Quit");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                    System.out.println("Enter radius of circle:");
                    int rad = sc.nextInt();
                    circle = new Circle(rad);
                    System.out.println("New circle created.");
                    break;
                case 2:
                    if(circle == null){
                        System.out.println("Circle has not been created.");
                    }
                    else{
                        System.out.println("Area of circle of radius " + circle.getRadius() + " is: ");
                        circle.printArea();
                    }
                    break;
                case 3:
                    if(circle == null){
                        System.out.println("Circle has not been created.");
                    }
                    else{
                        System.out.println("Circumference of circle of radius " + circle.getRadius() + " is: ");
                        circle.printCircumference();
                    }
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        } while (choice < 4 && choice > 0);
        sc.close();
    }
}
