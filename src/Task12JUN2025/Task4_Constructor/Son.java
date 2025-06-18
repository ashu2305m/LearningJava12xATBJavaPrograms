package Task12JUN2025.Task4_Constructor;

public class Son extends Father{

    int values;
    String Wealth;

    public Son(int gold, int money, String manners, int values, String wealth) {
        super(gold, money, manners);
        this.values = values;
        Wealth = wealth;
    }

    void upgardehome(){
        System.out.println("Son 3 BHK Home!");
    }
}
