package Task12JUN2025.Task4_Constructor;

public class Constructorcall {
    public static void main(String[] args) {
        Father ff = new Father(1000, 50000, "Honesty");
        System.out.println(ff.gold);
        System.out.println(ff.money);
        System.out.println(ff.manners);
        ff.home();

        Son ss = new Son(2000,50000, "Punctuality", 2, "land");
        System.out.println(ss.values);
        System.out.println(ss.Wealth);
       // System.out.println(ff.gold);
       // System.out.println(ff.money);
       // System.out.println(ff.manners);
        ss.upgardehome();
        ss.home();
    }
}
