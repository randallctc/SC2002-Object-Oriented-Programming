import java.util.* ; 
/*Things student can do
1) View list of camps 
2) View remaining slots of each camp
3) Register for camp (attendee/committee)
4) Submit enquiries based on camp
5) View registered camps
6) Withdraw from camp
*/
public class StudentMenu{
    public static void printMenu(Student student){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("(1) View Camps");
            System.out.println("(2) View Registered Camps");
            System.out.println("(3) Change password");
            System.out.println("(4) Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    ViewCampMenu.menu();
                    break;
                case 2:
                    ViewRegistered.menu();
                    break;
                case 3:
                    //change password
                    break;
                default:
                    break;
            }
        }while(choice < 3);
    }
}
