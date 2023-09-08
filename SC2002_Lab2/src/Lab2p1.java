import java.util.*;
public class Lab2p1{
    public static void main(String[] args){
    int choice;
    Scanner sc = new Scanner(System.in);
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
                Scanner scanner = new Scanner(System.in);
                if(scanner.hasNextInt()){
                    firstInt = scanner.nextInt();
                }
                else{
                    System.out.println("Invalid integer.");
                    scanner.close();
                    return;
                }
                System.out.println("What is second integer?");
                Scanner scannner = new Scanner(System.in);
                if(scannner.hasNextInt()){
                    secondInt = scannner.nextInt();
                }
                else{
                    System.out.println("Invalid integer.");
                    scannner.close();
                    return;
                }
                System.out.println(firstInt + "/" + secondInt + " = " + divide(firstInt, secondInt));
                break;
            case 3: 
                int firrstInt, seccondInt;
                System.out.println("What is first integer?");
                Scanner scannnner = new Scanner(System.in);
                if(scannnner.hasNextInt()){
                    firrstInt = scannnner.nextInt();
                }
                else{
                    System.out.println("Invalid integer.");
                    scannnner.close();
                    return;
                }
                System.out.println("What is second integer?");
                Scanner scannnnner = new Scanner(System.in);
                if(scannnnner.hasNextInt()){
                    seccondInt = scannnnner.nextInt();
                }
                else{
                    System.out.println("Invalid integer.");
                    scannnnner.close();
                    return;
                }
                System.out.println(firrstInt + "%" + seccondInt + " = " + modulus(firrstInt, seccondInt));
                break;
            case 4:
                System.out.println("Enter integer: ");
                Scanner sc1 = new Scanner(System.in);
                if(sc1.hasNextInt()){
                    int countInt = sc1.nextInt();
                    if(countInt < 0){
                        System.out.println("Error Input!!");
                        sc1.close();
                        return;
                    }
                    else{
                        System.out.println("Number of Digits: " + countDigits(countInt));
                    }
                }
                else{
                    System.out.println("Please input an integer.");
                    sc1.close();
                    return;
                }
                break;
            case 5:
                int positionInt; 
                System.out.println("Enter integer: ");
                Scanner sc2 = new Scanner(System.in);
                if(sc2.hasNextInt()){
                    positionInt = sc2.nextInt();
                }
                else{
                    System.out.println("Please input an integer.");
                    sc2.close();
                    return;
                }
                System.out.println("Enter digit: ");
                Scanner sc3 = new Scanner(System.in);
                if(sc3.hasNextInt()){
                    int digitToFind = sc3.nextInt();
                    if(digitToFind >= 10){
                        System.out.println("Please enter single digit.");
                        sc3.close();
                        return;
                    }
                    System.out.println("Position: " + position(positionInt, digitToFind));
                }
                else{
                    System.out.println("Please input an integer.");
                    sc3.close();
                    return;
                }
                break;
            case 6: 
                System.out.println("Enter positive number: ");
                long n;
                Scanner sc4 = new Scanner(System.in);
                if(sc4.hasNextLong()){
                    n = sc4.nextLong();
                    if(n < 0){
                        System.out.println("Error Input!!");
                        sc4.close();
                        return;
                    }
                }
                else{
                    System.out.println("Error Input!!");
                    sc4.close();;
                    return;
                }
                System.out.println("oddDigits = " + extractOddDigits(n));
                sc4.close();
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
            int int1 = random.nextInt(9) + 1;
            int int2 = random.nextInt(9) + 1;
            System.out.println("How much is " + int1 + " * " + int2 + "?");
            if(scanner1.hasNextInt()){
                int answer = scanner1.nextInt();
                if(answer == (int1 * int2)){
                    correct++;
                }
            }
            else{
                System.out.println("Invalid answer.");
                scanner1.close();
                return;
            }
        }
        System.out.println(correct +" answers out of 5 are correct.");
        scanner1.close();
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