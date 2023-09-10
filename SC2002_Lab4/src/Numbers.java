import java.util.Scanner;

public class Numbers {
    public static void main (String[] args){
        int[] intList;
        Integer[] integerList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new int[size];
        integerList = new Integer[intList.length];
        System.out.println ("\nEnter the numbers...");
        for (int i = 0; i < size; i++){
            intList[i] = scan.nextInt();
            integerList[i] = Integer.valueOf(intList[i]);
        }
        Sorting.insertionSort(integerList);
        System.out.println ("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++){
            System.out.print(integerList[i] + " ");
        }
        System.out.println ();
        scan.close();
	}
}
