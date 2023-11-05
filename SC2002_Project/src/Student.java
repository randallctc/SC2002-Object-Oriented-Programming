public class Student extends User{
    boolean committee = false;
    void toggleCommittee(){
        if(!this.committee){
            this.committee = true;
        }
        else{
            this.committee = false;
        }
    }
    boolean getCommittee(){
        return this.committee;
    }
}