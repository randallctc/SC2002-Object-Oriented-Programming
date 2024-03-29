package Boundary;
/**
UI Menu for Staff 
@author Thor Jia Ying
@version 1.0
@since 2023-11-26
*/
import java.io.IOException;
import java.util.*;
import Controller.Beauty;
import Controller.CampEditor;
import Controller.CampModifier;
import Controller.LogoutHandler;
import Controller.PasswordHandler;
import Controller.StaffViewHandler;
import Entity.Camp;
import Entity.Staff;
import Manager.StaffManager;

public class StaffMenu {
/**
 * Printing the menu
 * @param aStaff
 * @param arrayList
 * @throws IOException
 */
    public static void printMenu(Staff aStaff, ArrayList<Camp> arrayList) throws IOException{
        System.out.println(Beauty.RED);
        Scanner sc = new Scanner(System.in);
        int choice;
        int i;
        do{
            Beauty.StaffMenu();
            System.out.println("(1) View All Camps");
            System.out.println("(2) View Created Camps");
            System.out.println("(3) Create a camp");
            System.out.println("(4) Delete a Camp");
            System.out.println("(5) Edit camps");
            System.out.println("(6) Change password");
            System.out.println("(7) Logout");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    StaffViewHandler.view();
                    break;

                case 2:
                    StaffCreated.printMenu(aStaff);  
                    break;

                case 3:
                    CampModifier.createCamp(aStaff);                  
                    break;
                    
                case 4:
                    CampModifier.deleteCamp(aStaff);
                    break;

                case 5:
                    CampEditor.editCamp(aStaff);
                    break;

                case 6: 
                    PasswordHandler.changePassword(aStaff);
                    StaffManager.updateStaff(aStaff);
                    break;
                case 7:
                    //save
                    System.out.println(Beauty.RESET);
                    LogoutHandler.logout();
                    break;
            } if (choice != 7 && choice !=5) Beauty.backFunction();
        } while(choice < 8 && choice>0);
    }
}