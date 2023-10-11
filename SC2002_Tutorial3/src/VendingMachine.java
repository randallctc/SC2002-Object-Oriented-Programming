import java.util.*;
public class VendingMachine {
    Scanner sc = new Scanner(System.in);
    int choice;
    public VendingMachine(){
    };
    public double selectDrink(){
        System.out.println("====== Vending Machine ======");
        System.out.println("|1. Buy Beer ($3.00) |");
        System.out.println("|2. Buy Coke ($1.00) |");
        System.out.println("|3. Buy Green Tea ($5.00) |");
        System.out.println("============================");  
        System.out.println("Please enter selection: ");
        choice = sc.nextInt();
        double price = 0;
        switch(choice){
            case 1:
                System.out.println("Beer chosen.");
                price =  3.00;
                break;
            case 2:
                System.out.println("Coke chosen.");
                price = 1.00;
                break;
            case 3:
                System.out.println("Green Tea chosen.");
                price = 5.00;
                break;
            default:
                System.out.println("Invalid choice.");
        } 
        return price; 
    }
    public double insertCoins(double drinkCost){
        double money = 0;
        char coin;
        do{
            System.out.println("Please insert coins:\r\n" + //
                    "========== Coins Input ===========\r\n" + //
                    "|Enter 'Q' for ten cents input |\r\n" + //
                    "|Enter 'T' for twenty cents input|\r\n" + //
                    "|Enter 'F' for fifty cents input |\r\n" + //
                    "|Enter 'N' for a dollar input |\r\n" + //
                    "==================================");
            coin = sc.next().charAt(0);
            switch(Character.toLowerCase(coin)){
                case 'q':
                    money += 0.10;
                    System.out.println("Coins inserted: $" + money);
                    break;
                case 't':
                    money += 0.20;
                    System.out.println("Coins inserted: $" + money);
                    break;
                case 'f':
                    money += 0.50;
                    System.out.println("Coins inserted: $" + money);
                    break;
                case 'n':
                    money += 1.00;
                    System.out.println("Coins inserted: $" + money);
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }while(money < drinkCost);
        return money;
    }
    public void checkChange(double amount, double drinkCost){
        double change = amount - drinkCost;
        System.out.println("Change is $" + change);
        this.printReceipt();
    }
    public void printReceipt(){
        System.out.println("Please collect your drink, Thank You !!");
    }
}
