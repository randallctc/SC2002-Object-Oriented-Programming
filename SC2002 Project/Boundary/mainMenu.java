package Boundary;
/**
Main menu UI 
Available to all users when the program first runs
@author Thor Jia Ying
@version 1.0
@since 2023-11-26
*/
import java.io.IOException;
import java.util.*;
import Controller.Beauty;
import Controller.ClearDatabase;
import Controller.InitialiseHandler;
import Controller.LoadDataHandler;
import Controller.LoginHandler;
import Controller.SaveHandler;

public class mainMenu {
/**
 * printing the login page
 * @throws IOException
 */
public static void printMainMenu() throws IOException{
        Scanner sc= new Scanner(System.in);
        int choice;
        int i;
         do{
            Beauty.mainMenu();
            System.out.println("(1) Login");
            System.out.println("(2) Intialise Database");
            System.out.println("(3) Clear Database");
            System.out.println("(4) Exit");
            System.out.println("Enter choice: ");
            do{
                choice = sc.nextInt();
            }while (choice >5);
            
            switch(choice){
                case 1:
                    InitialiseHandler.initialise(); 
                    LoginHandler.login();
                    break;

                case 2:
                    LoadDataHandler.loaddata(); 
                    break;

                case 3:
                    ClearDatabase.clearAll();
                    System.out.println("Database has been cleared");                  
                    break;
                    
                case 4:
                    System.out.println("Exiting Program");
                    SaveHandler.saveData();
                    System.exit(0);
                    break;
                } if (choice != 4) Beauty.backFunction();
                }while(choice < 4 && choice>0);
        } 
        
/**
 * For when the user key in wrong password, brings back to login page again
 */
public static void returnMenu(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Password is wrong!\nPress <key> to return");
        sc.next();
        return;
}
}