package Task12JUN2025.Task1_SingleInheritance;

public class Dog extends Animal{
    public static void main(String[] args) {
        Dog dd = new Dog();
        dd.Sound();  // Dog sound method!
        Animal aa = new Dog();
        aa.Sound();  // Dog sound method!
        Animal aa1 = new Animal();
        aa1.Sound(); // Animal Sound method!
    }
    @Override
    // Method overriding
    void Sound() {
        System.out.println("Dog sound method!");
    }
}
