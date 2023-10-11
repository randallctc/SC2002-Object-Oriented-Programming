import java.util.*;
public class Lab2p1{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
        System.out.println("Perform the following methods:");
        System.out.println("1: multiplication test");
        System.out.println("2: quotient using division by subtraction");
        System.out.println("3: remainder using division by subtraction");
        System.out.println("4: count the number of digits");
        System.out.println("5: position of a digit");
        System.out.println("6: extract all odd digits");
        System.out.println("7: quit");
        choice = sc.nextInt();
        switch (choice) {
            case 1: 
                mulTest();
                break;
            case 2:
                int firstInt, secondInt;
                System.out.println("What is first integer?");
                firstInt = sc.nextInt();
                System.out.println("What is second integer?");
                secondInt = sc.nextInt();
                System.out.println(firstInt + "/" + secondInt + " = " + divide(firstInt, secondInt));
                break;
            case 3: 
                int firrstInt, seccondInt;
                System.out.println("What is first integer?");
                firrstInt = sc.nextInt();
                System.out.println("What is second integer?");
                seccondInt = sc.nextInt();
                System.out.println(firrstInt + "%" + seccondInt + " = " + modulus(firrstInt, seccondInt));
                break;
            case 4:
                System.out.println("Enter integer: ");
                int countInt = sc.nextInt();
                System.out.println("Number of Digits: " + countDigits(countInt));
                break;
            case 5:
                int positionInt; 
                System.out.println("Enter integer: ");
                positionInt = sc.nextInt();
                System.out.println("Enter digit: ");
                int digitToFind = sc.nextInt();
                System.out.println("Position: " + position(positionInt, digitToFind));
                break;
            case 6: 
                System.out.println("Enter positive number: ");
                long n;
                n = sc.nextLong();
                if(n < 0){
                    System.out.println("Error Input!!");
                    return;
                }
                System.out.println("oddDigits = " + extractOddDigits(n));
                break;
            case 7: System.out.println("Program terminating ….");
            }
        }while (choice < 7);
        sc.close();
    }

    public static void mulTest(){
        int correct = 0;
        Scanner scanner1 = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            Random random = new Random();
            int int1 = random.nextInt(10);
            int int2 = random.nextInt(10);
            System.out.println("How much is " + int1 + " * " + int2 + "?");
            if((int1*int2) == scanner1.nextInt()){
                    correct++;
                }

        }
        System.out.println(correct +" answers out of 5 are correct.");
    }

    public static int divide(int m, int n){
        int count = 0;
        while(m >= n){
            m -= n;
            count++;
        }
        return count;
    }

    public static int modulus(int m, int n){
        while(m >= n){
            m -= n;
        }
        return m;
    }
    
    public static int countDigits(int n){
        if(n == 0){
            return 1;
        }
        int count = 0;
        double check0 = n;
        while(check0 > 1){
            check0 /= 10;
            count++;
        }
        return count;
    }

    public static int position(int n, int digit){
        int position = 1;
        double checkN = n;
        while(checkN > 1){
            int intCheck = (int)checkN%10;
            if(intCheck == digit){
                return position;
            }
            else{
                checkN /= 10;
                position++;
            }
        }
        return -1;
    }

    public static long extractOddDigits(long n){
        long digitAdder = 1;
        int oddIntegers = 0;
        long longOdd = 0;
        while(n > 0){
            if((n%10%2) == 1){
                longOdd += (digitAdder * (n%10));
                oddIntegers++;
                digitAdder = digitAdder * 10;
            }
            n /= 10;
        }
        if(oddIntegers == 0){
            return -1;
        }
        return longOdd;
    }
}
