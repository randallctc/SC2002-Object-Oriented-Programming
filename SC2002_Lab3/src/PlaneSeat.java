public class PlaneSeat {
    private int seatID;
    private boolean assigned;
    private int customerID;
    public PlaneSeat(int seat_id){
        this.seatID = seat_id;
        this.assigned = false;
        this.customerID = -1;
    }
    public int getSeatID(){
        return this.seatID;
    }
    public int getCustomerID() {
        return this.customerID;
    }
    public boolean isOccupied(){
        return this.assigned;
    }
    public void assign(int cust_id){
        this.customerID = cust_id;
        this.assigned = true;
    }
    public void unassign(){
        this.assigned = false;
    }
}
