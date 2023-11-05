import java.util.*;
public class ViewRegisteredMenu {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int choice;
        //Print registered camps
        do{
            choice = sc.nextInt();
            System.out.println("(1) Withdraw from camp");
            System.out.println("(2) Exit");
            switch(choice){
                case 1:
                    WithdrawMenu.menu();
                    break;
                default:
                    break;
        }while(choice < 2);
    }
}
