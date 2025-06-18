package ex_20_OOPs_Super_Abstraction;

public class Lab191 {
    public static void main(String[] args) {
        Pramod d = new Dutta(); // Dynamic Dispatch with Interface
        Dutta d1 = new Dutta(); // Normal object creation
        d.display();
        System.out.println(d.a);
    }
}

class Dutta implements Pramod{


    @Override
    public void display() {
        System.out.println(a);
    }
}
interface Pramod{
    int a = 10;
    void display();
}
