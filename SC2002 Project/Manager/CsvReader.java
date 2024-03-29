package Manager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Entity.Staff;
import Entity.Student;
/**
 * The CsvReader class provides methods to read data from CSV files and populate
 * manager classes with the information read from the CSV.
 */
public class CsvReader {
    /**
     * Reads data from the staff CSV file and pass into the StaffManager.
     * Each staff record in the CSV file is expected to have three columns:
     * name, email, and faculty.
     */
    public static void readstaff(){
        String path = "/Users/thorjiaying/Downloads/SC2002-Final 3/staff.csv";
        String line="";
        StaffManager staffManager=new StaffManager();
        int count=0;
        try{
            BufferedReader br=new BufferedReader(new FileReader(path));
            while ((line=br.readLine())!=null){
                String [] values=line.split(",");

                if (line.trim().isEmpty()|| line.split(",").length == 0) {
                    continue;
                }
                for (int i=0;i<3;i++)
                {
                    values[i]=values[i].trim();
                }
                //System.out.println(values[0]);
                if (count!=0)
                {
                    int indexofat=values[1].indexOf('@');
                    String id = values[1].substring(0,indexofat).toUpperCase();
                    staffManager.addNewStaff(new Staff(id.toUpperCase(),values[0].toUpperCase(),"password", values[2].toUpperCase()));
                }
                count++;//first loop dont add, if not will add Header in
                
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    /**
     * Reads  data from the student CSV file and pass into the StaffManager.
     * Each student record in the CSV file is expected to have three columns:
     * name, email, and faculty.
     */
    public static void readstudent(){
         String path = "/Users/thorjiaying/Downloads/SC2002-Final 3/student.csv";
         String line="";
         StudentManager studentmanager=new StudentManager();
         int count=0;
         try{
            BufferedReader br=new BufferedReader(new FileReader(path));
            while ((line=br.readLine())!=null){
                if (line.trim().isEmpty()|| line.split(",").length == 0) {
                    continue;
                }
                
                String [] values=line.split(",");
                for (int i=0;i<3;i++)
                {
                    values[i]=values[i].trim();
                }
                //System.out.println(values[0]);
                int indexofat=values[1].indexOf('@');
                if (count!=0)
                {
                String id = values[1].substring(0,indexofat).toUpperCase();
                studentmanager.addStudent(new Student(id.toUpperCase(),values[0].toUpperCase(),"password", values[2].toUpperCase()));
                }
                count++;
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
