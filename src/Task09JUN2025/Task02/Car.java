package Task09JUN2025.Task02;

public class Car {
    public static void main(String[] args) {
         Car cc = new Car("Brand-X", "Model-Y", 90000L );
         cc.Car_Details();
    }

    String brand;
    String model;
    Long price;

    public Car(String brand, String model, Long price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

     void Car_Details(){
         System.out.println("Brand of Car is: "+brand);
         System.out.println("Model of Car is: "+model);
         System.out.println("Price of Car is: "+price);
     }
}
