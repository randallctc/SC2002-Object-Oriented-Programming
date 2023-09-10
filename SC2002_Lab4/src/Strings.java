import java.util.Scanner;
public class Strings
{
// --------------------------------------------
// Reads in an array of integers, sorts them,
// then prints them in sorted order.
// --------------------------------------------
    public static void main (String[] args)
    {
        Object[] objectList;
        String[] stringList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        objectList = new Object[size];
        stringList = new String[objectList.length];
        System.out.println ("\nEnter the strings...");
        for (int i = 0; i < size; i++){
            objectList[i] = scan.next();
            stringList[i] = String.valueOf(objectList[i]);
        }
        Sorting.insertionSort(stringList);
        System.out.println ("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++){
            System.out.print(stringList[i] + " ");
        }
        System.out.println ();
        
        scan.close();
    }
}