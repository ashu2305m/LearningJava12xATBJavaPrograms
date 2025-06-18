package Task12JUN2025.Task2_MultilevelInheritance;

public class Child extends Parent{
    public static void main(String[] args) {
        Child CC = new Child();
        System.out.println(CC.gold);
        CC.bhk1();
        CC.bhk2();
        CC.bhk3();
        System.out.println("------------------");

        Parent pp = new Parent();
        pp.bhk2();
        pp.bhk1();
        System.out.println("------------------");

        Grandparent gg = new Grandparent();
        gg.bhk1();

    }

    void bhk3(){
        System.out.println("Child- 3 BHK");
    }
}
