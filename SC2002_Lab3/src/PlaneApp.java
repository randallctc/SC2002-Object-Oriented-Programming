import java.util.*;
public class PlaneApp {
    public static void main(String args[]){ 
        int choice;
        Scanner sc = new Scanner(System.in);
        Plane plane = new Plane();     
        do{
            System.out.println("(1) Show number of empty seats");
            System.out.println("(2) Show the list of empty seats");
            System.out.println("(3) Show the list of seat assignments by seat ID");
            System.out.println("(4) Show the list of seat assignments by customer ID");
            System.out.println("(5) Assign a customer to a seat");
            System.out.println("(6) Remove a seat assignment");
            System.out.println("(7) Exit");
            System.out.println("Enter the number of your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1 :
                    plane.showNumEmptySeats();
                    break;
                case 2 :
                    plane.showEmptySeats();
                    break;
                case 3 : 
                    plane.showAssignedSeats();
                    break;
                case 4 :
                    PlaneSeat[] copy = plane.getSortedSeats().clone();
                    for(int i = 0; i < 12; i++){
                        if(copy[i].isOccupied() == true){
                            System.out.println("SeatID " + copy[i].getSeatID() + " is assigned to Customer ID " + copy[i].getCustomerID());
                        }
                    }
                    break;
                case 5:
                    int seatid, customerid;
                    System.out.println("Assigning Seat...");
                    System.out.println("Please enter SeatID: ");
                    Scanner sc1 = new Scanner(System.in);
                    seatid = sc1.nextInt();
                    System.out.println("Please enter CustomerID: ");
                    Scanner sc2 = new Scanner(System.in);
                    customerid = sc2.nextInt();
                    plane.assignSeat(seatid, customerid);
                    break;
                case 6:
                    int unseatid;
                    System.out.println("Enter SeatID to unassign customer from: ");
                    Scanner sc3 = new Scanner(System.in);
                    unseatid = sc3.nextInt();
                    plane.unAssignSeat(unseatid);
                    break;
                case 7:
                    System.out.println("Terminating program...");
                    break;
            }
        }while (choice < 7);
        sc.close();
    }
}
