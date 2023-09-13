import java.util.Scanner;
public class Shapes3DApp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many shapes?");
        int shapesNo = sc.nextInt();
        Shapes[] shapesList = new Shapes[shapesNo]; 
        System.out.println("1 : Sphere");
        System.out.println("2 : Cylinder");
        System.out.println("3 : Cone");
        System.out.println("4 : Pyramid");
        System.out.println("5 : Cuboid");
        for(int i = 0; i< shapesNo; i++){
            System.out.println("Choose shape for shape " + (i+1) + ":");
            int shapeChoice = sc.nextInt();
            switch(shapeChoice){
                case 1 : 
                    System.out.println("Enter radius of Sphere:");
                    double r = sc.nextDouble();
                    shapesList[i] = new Sphere(r);
                    break;
                case 2 :
                    System.out.println("Enter height of Cylinder:");
                    double h1 = sc.nextDouble();
                    System.out.println("Enter radius of Cylinder:");
                    double r1 = sc.nextDouble();
                    shapesList[i] = new Cylinder(r1, h1);
                    break;
                case 3 :
                    System.out.println("Enter height of Cone:");
                    double h2 = sc.nextDouble();
                    System.out.println("Enter radius of Cone :");
                    double r2 = sc.nextDouble();
                    shapesList[i] = new Cone(r2, h2);
                    break;
                case 4 : 
                    System.out.println("Enter height of Pyramid:");
                    double h3 = sc.nextDouble();
                    System.out.println("Enter base length of Pyramid:");
                    double l1 = sc.nextDouble();
                    shapesList[i] = new Pyramid(h3, l1);
                    break;
                case 5 : 
                    System.out.println("Enter height of Cuboid:");
                    double h4 = sc.nextDouble();
                    System.out.println("Enter base length of Cuboid:");
                    double l2 = sc.nextDouble();
                    shapesList[i] = new Cuboid(h4, l2);
                    break;
                default:
                    System.out.println("Please enter integer 1-5.");
                }
            }
            double total = 0;
            for(int j = 0; j < shapesNo; j++){
                total += shapesList[j].area();
                if(j >= 1){
                    if(shapesList[j-1] instanceof Pyramid|shapesList[j-1] instanceof Sphere|shapesList[j-1] instanceof Cone|shapesList[j] instanceof Sphere){
                        continue;
                    }
                    else{
                        total -= 2 * Math.min(shapesList[j].baseArea(), shapesList[j-1].baseArea());
                    }
                }
            }
            System.out.println("Total area of 2D shapes = " + total);
            sc.close();
       }
}
