public class Dice {
    private int valueOfDice;
    public Dice(){
        this.setDiceValue();
    }
    public void setDiceValue(){
        this.valueOfDice = (int)Math.floor(Math.random() * 6 + 1);
    }
    public int getDiceValue(){
        return this.valueOfDice;
    }
    public void printDiceValue(){
        System.out.println("Value of Dice: " + this.getDiceValue());
    }
}
