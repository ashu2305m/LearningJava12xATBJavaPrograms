package Task09JUN2025.Task05;

public class Mobile {
    public static void main(String[] args) {
          Mobile mm = new Mobile("Brand-X");
          mm.Display();
          Mobile mm1 = new Mobile("Brand-Y", 40000);
          mm1.Display();
    }

    String brand;
    int price = 20000;

    Mobile(String brand){
        this.brand = brand;
    }

    Mobile(String brand, int price){
        this.brand = brand;
        this.price = price;
    }


    void Display(){
        System.out.println("Brand is -> "+brand);
        System.out.println("Price is -> "+price);
    }

}
