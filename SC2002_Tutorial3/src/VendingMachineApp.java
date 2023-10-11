public class VendingMachineApp{
    public static void main(String args[]){
        VendingMachine vendingMachine = new VendingMachine();
        double drinkCost = vendingMachine.selectDrink();
        double amount = vendingMachine.insertCoins(drinkCost);
        vendingMachine.checkChange(amount, drinkCost);
    }
}