import java.util.*;
public class EnquiryMenu {
    public static void menu(){
        //Print camp list
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Select camp for enquiry: ");
        choice = sc.nextInt();
        String campName;
        //campName = selected camp
        System.out.println("Enter enquiry: ");
        String enquiryContent = sc.next();
        Enquiry newEnquiry = new Enquiry(enquiryContent, campName);
        //Add newEnquiry into ArrayList of Enquiries
    }
}
