import java.util.*;
public class P3 {
    public static void main(String args[]){
        int starting, ending, increment;
        System.out.println("Starting: ");
        Scanner scanner1 = new Scanner(System.in);
        if(scanner1.hasNextInt()){
            starting = scanner1.nextInt();
        }
        else{
            System.out.println("Invalid Input.");
            scanner1.close();
            return;
        }
        System.out.println("Ending: ");
        Scanner scanner2 = new Scanner(System.in);
        if(scanner2.hasNextInt()){
            ending = scanner2.nextInt();
        }
        else{
            System.out.println("Invalid Input.");
            scanner1.close();
            scanner2.close();
            return;
        }
        System.out.println("Increment: ");
        Scanner scanner3 = new Scanner(System.in);
        if(scanner3.hasNextInt()){
            increment = scanner3.nextInt();
        }
        else{
            System.out.println("Invalid Input.");
            scanner1.close();
            scanner2.close();
            scanner3.close();
            return;
        }
        if(starting > ending | increment <= 0){
            System.out.println("Error Inputs.");
            scanner1.close();
            scanner2.close();
            scanner3.close();
            return;
        }
        System.out.println("Using for loop:");
        System.out.println("US$      S$"); //6 spaces
        System.out.println("--------------");
        for(int i = starting; i <= (ending/increment); i++){
            double sgd = i*1.82;
            System.out.println(i*increment + "     " + sgd);
        }
        System.out.println("Using while loop:");
        System.out.println("US$      S$"); //6 spaces
        System.out.println("--------------");
        int usd = starting;
        while(usd <= ending){
            double sgd = usd*1.82;
            System.out.println(usd + "     " + sgd);
            usd += increment;
        }
        System.out.println("Using do/while loop:");
        System.out.println("US$      S$"); //6 spaces
        System.out.println("--------------");
        int usd2 = starting;
        do{
            double sgd = usd2*1.82;
            System.out.println(usd2 + "     " + sgd);
            usd2 += increment;
        }while(usd2 <= ending);
        scanner1.close();
        scanner2.close();
        scanner3.close();
    }
}
