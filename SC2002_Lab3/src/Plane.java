import java.util.*;
public class Plane {
    private PlaneSeat[] seat = new PlaneSeat[12];
    private int numEmptySeat;
    public Plane(){
        this.numEmptySeat = 12;
        this.seat = new PlaneSeat[12];
        for(int i = 0; i < 12; i++){
            seat[i] = new PlaneSeat(i+1);
        }
    }
    private PlaneSeat[] sortSeats(){
        PlaneSeat[] copy = this.seat.clone();
        Comparator<PlaneSeat> seatComparator = new Comparator<PlaneSeat>() {
            public int compare(PlaneSeat seat1, PlaneSeat seat2) {
                return Integer.compare(seat1.getCustomerID(), seat2.getCustomerID());
            }
        };
        Collections.sort(Arrays.asList(copy), seatComparator);
        return copy;
    }
    public void showNumEmptySeats(){
        System.out.println("There are " + this.numEmptySeat + " empty seats.");
    }
    public void showEmptySeats(){
        for(int i = 0; i < 12; i++){
            if(seat[i].isOccupied() == false){
                System.out.println("SeatID " + (i+1) + " is empty.");
            }
        }
    }
    public void showAssignedSeats(){
        for(int i = 0; i < 12; i++){
            if(seat[i].isOccupied() == true){
                System.out.println("SeatID " + (i+1) + " is assigned to Customer ID" + seat[i].getCustomerID());
            }
        }
    }
    public void assignSeat(int seatId, int cust_id){
        if(seat[seatId-1].isOccupied() == false){
            seat[seatId-1].assign(cust_id);
            System.out.println("Seat Assigned!");
            numEmptySeat--;
        }
        else{
            System.out.println("Seat already assigned to a customer.");
        }
    }
    public void unAssignSeat(int seatId){
        if(seat[seatId-1].isOccupied() == true){
            seat[seatId-1].unassign();
            System.out.println("Seat Unassigned!");
            numEmptySeat++;
        }
        else{
            System.out.println("Seat is already empty.");
        }
    }
    public PlaneSeat[] getSortedSeats(){
        return this.sortSeats();
    }
}
