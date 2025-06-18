package Task12JUN2025.Task6_SuperKeyword;

public class Son extends Father{
    public static void main(String[] args) {
        Son ss = new Son(1000, 50000, 2, "Land");
        ss.upgardehome();

    }
    int values;
    String Wealth;


    public Son(int gold, int money, int values, String wealth) {
        super(gold, money); // using super to get parent attributes
        this.values = values;
        this.Wealth = wealth;
    }


    void upgardehome(){
        System.out.println("Son 3 BHK Home!");
        super.home();
        System.out.println(super.gold);
        System.out.println(super.money);
    }
}

