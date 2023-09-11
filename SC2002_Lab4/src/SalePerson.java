public class SalePerson implements Comparable<SalePerson> {
    private String firstName;
    private String lastName;
    private int totalSales;
    public SalePerson(String fn, String ln, int sales){
        this.firstName = fn;
        this.lastName = ln;
        this.totalSales = sales;
    }
    public String getLastname(){
        return this.lastName;
    }
    public String getFirstname(){
        return this.firstName;
    }
    public int getTotalSales(){
        return totalSales;
    }
    public String toString(){
        return (this.lastName + " , " + this.firstName + " : " + this.totalSales);
    }
    public boolean equals(SalePerson o){
        if(o.getLastname() == this.getLastname() && o.getFirstname() == this.getFirstname()){
            return true;
        }
        else{
            return false;
        }
    }
    public int compareTo(SalePerson o){
        if(o.getTotalSales() > this.getTotalSales()){
            return -1;
        }
        else if(o.getTotalSales() < this.getTotalSales()){
            return 1;
        }
        else{
            String[] compareLast = new String[2];
            compareLast[0] = o.getLastname();
            compareLast[1] = this.getLastname();
            Sorting.selectionSort(compareLast);
            if(compareLast[0] == this.lastName){
                return 1;
            }
            else{
                return -1;
            }
        }
    }
}
