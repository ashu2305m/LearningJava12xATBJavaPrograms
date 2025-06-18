package Task12JUN2025.Task3_HierarchicalInheritance;

public class Bike extends Vehicle{
    public static void main(String[] args) {
       Bike bb= new Bike();
       bb.Wheels();
       bb.Design();
       bb.Engine();
       System.out.println("------------------------");

       Car cc = new Car();
       cc.Making();
       cc.Design();
       cc.Engine();
       System.out.println("------------------------");

       Vehicle v = new Vehicle();
       v.Design();
       v.Engine();


    }

    void Wheels(){
        System.out.println("Bike- 2 Wheels");
    }
}
