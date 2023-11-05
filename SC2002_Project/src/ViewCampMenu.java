import java.util.*;

public class ViewCampMenu {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            //Print list of camps open to student, maybe need PrintCampList class
            System.out.println("(1) View remaining slots of each camp");
            System.out.println("(2) Register for camp");
            System.out.println("(3) Submit enquiry for camp");
            System.out.println("(4) Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    //Use PrintCampList class
                    break;
                case 2:
                    RegisterForCampMenu.menu();
                    break;
                case 3:
                    EnquiryMenu.menu();
                    break;
                default:
                    break;
            }
        }while(choice<4);
    }
}
