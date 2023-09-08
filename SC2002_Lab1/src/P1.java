import java.util.*;
public class P1 {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        char choice = input.next().charAt(0);
        switch(Character.toUpperCase(choice)){
            case 'A':
                System.out.println("Action Movie Fan");
                break;
            case 'B':
                System.out.println("Comedy Movie Fan");
                break;
            case 'C':
                System.out.println("Drama Movie Fan");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        input.close();
    }
}
