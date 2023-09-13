import java.util.*;
public class Shape2DApp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many shapes?");
        int shapesNo = sc.nextInt();
        Shapes[] shapesList = new Shapes[shapesNo]; 
        System.out.println("1 : Square");
        System.out.println("2 : Rectangle");
        System.out.println("3 : Circle");
        System.out.println("4 : Triangle");
        for(int i = 0; i< shapesNo; i++){
            System.out.println("Choose shape for shape " + (i+1) + ":");
            int shapeChoice = sc.nextInt();
            switch(shapeChoice){
                case 1 : 
                    System.out.println("Enter length of side of square:");
                    double s = sc.nextDouble();
                    shapesList[i] = new Square(s, s, s);
                    break;
                case 2 :
                    System.out.println("Enter height of rectangle:");
                    double h1 = sc.nextDouble();
                    System.out.println("Enter length of rectangle:");
                    double l1 = sc.nextDouble();
                    System.out.println("Enter width of rectangle:");
                    double w1 = sc.nextDouble();
                    shapesList[i] = new Square(h1, l1, w1);
                    break;
                case 3 :
                    System.out.println("Enter radius of circle :");
                    double r = sc.nextDouble();
                    shapesList[i] = new Circle(r);
                    break;
                case 4 : 
                    System.out.println("Enter height of triangle:");
                    double h2 = sc.nextDouble();
                    System.out.println("Enter length of triangle:");
                    double l2 = sc.nextDouble();
                    System.out.println("Enter width of triangle:");
                    double w2 = sc.nextDouble();
                    shapesList[i] = new Square(h2, l2, w2);
                    break;
                default:
                    System.out.println("Please enter integer 1-4.");
                }
            }
            double total = 0;
            for(int j = 0; j < shapesNo; j++){
                total += shapesList[j].area();
            }
            System.out.println("Total area of 2D shapes = " + total);
            sc.close();
       }
    }
