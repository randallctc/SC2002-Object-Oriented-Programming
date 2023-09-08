import java.util.*;
public class P2 {
    public static void main(String args[]){
        int salary, merit;
        System.out.println("Salary: ");
        Scanner scanner1 = new Scanner(System.in);
        if(scanner1.hasNextInt()){
            salary = scanner1.nextInt();
        }
        else{
            System.out.println("Invalid Input.");
            scanner1.close();
            return;
        }
        System.out.println("Merit: ");
        Scanner scanner2 = new Scanner(System.in);
        if(scanner2.hasNextInt()){
            merit = scanner2.nextInt();
        }
        else{
            System.out.println("Invalid Input.");
            scanner1.close();
            scanner2.close();
            return;
        }
        if (salary >= 700 && salary <= 899) {
            if (salary >= 700 && salary <= 799 && merit < 20) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade A");
            }
        } else if (salary >= 600 && salary <= 799) {
            if (salary >= 600 && salary <= 649 && merit < 10) {
                System.out.println("Grade C");
            } else {
                System.out.println("Grade B");
            }
        } else{
            System.out.println("Grade C");
        }
        scanner2.close();
        scanner1.close();
    }
}
