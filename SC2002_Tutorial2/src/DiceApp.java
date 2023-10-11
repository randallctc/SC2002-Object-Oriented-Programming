import java.util.*;
public class DiceApp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press <key> to roll first dice");
        Dice firstDice = null;
        Dice secondDice = null;
        sc.nextLine();
        firstDice = new Dice();
        System.out.println("Current value: " + firstDice.getDiceValue());
        System.out.println("Press <key> to roll second dice");
        sc.nextLine();
        secondDice = new Dice();
        System.out.println("Current value: " + secondDice.getDiceValue());
        if(firstDice != null && secondDice != null){
            System.out.println("Total is: " + (firstDice.getDiceValue() + secondDice.getDiceValue()));
        }
        sc.close();
    }
}

