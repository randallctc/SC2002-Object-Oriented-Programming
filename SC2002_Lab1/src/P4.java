import java.util.*;
public class P4 {
    public static void main(String args[]){
        int i;
        System.out.println("Number of levels:");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            i = scanner.nextInt();
        }
        else{
            System.out.println("Invalid Input");
            scanner.close();
            return;
        }
        if(i <= 0){
            System.out.println("Invalid Input");
            scanner.close();
            return;
        }
        for(int j = 1; j <= i; j++){
            for(int k = j; k >= 1; k--){
                if(k%2 != 0){
                    System.out.print("AA");
                }
                else{
                    System.out.print("BB");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
