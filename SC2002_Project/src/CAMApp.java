import java.util.* ; 

public class CAMApp{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("(1) Login");
		System.out.println("(2) Exit");
	
        do
		{
			System.out.print("\n  Enter the number of your choice: ");
			int choice = sc.nextInt();
			
			if (choice == 1){

                // ask if staff or student // 
                System.out.println("Enter your ID:" );
                String ID = sc.nextLine(); 
                System.out.println("Enter your Password:" );
                String PW = sc.nextLine(); 
                if ( LoginHandler.login(ID,PW) ) {
                    // if student create student object , if staff create staff object // 
                    // need to figure out how to pass in a usertype object from loggin in class
                    if ( student ){
                        // create student object // 
                    }
                    else if ( staff ){
                        //create staff object // 
                    }
                    Menu.printMenu( usertype) ;
                    // another do while loop ? // 
                    System.out.println("\n  Enter the number of your choice: ");
			        int choice = sc.nextInt(); 
                    selectoptions(usertype, choice)
                    }

            }




                     
    } while(choice!=2); 

    sc.close(); 
    }





















}