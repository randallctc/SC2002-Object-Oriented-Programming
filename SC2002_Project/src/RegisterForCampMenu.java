import java.util.*;
public class RegisterForCampMenu {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int camp;
        int choice;
        System.out.println("Choose which camp to register for:");
        //Use while loop to print through camp with menu number using int i and increment i after every camp printed
        camp = sc.nextInt();
        String campName;
        //Figure how to make campName = camp selected
        System.out.println("Enter type of participant: ");
        System.out.println("(1) Camp Committee");
        System.out.println("(2) Attendee");
        choice = sc.nextInt();
        if(choice == 1){
            //Student's camp committee attribute check, if true return
            if(student.getCommittee()){
                System.out.println("Already a committee member of another camp.");
            }
            else{
                //Check if registered for camp before ****
                //else minus camp slot + toggle commmittee attribute
                student.toggleCommittee();
                System.out.println("Now a committee member of " + campName + ".");
            }
        }
        else if(choice == 2){        
            //Check if registered for camp before ****    
            //Minus camp slot
            System.out.println("Now an attendee of " + campName + ".");
        }
    }
}
