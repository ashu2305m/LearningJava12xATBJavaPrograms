package Task08JUN2025;

public class Vehicle {
    // Private fields for Encapsulation
    private String brand;
    private int speed;
    // Param Constructor using 'this' keyword
    public Vehicle(String brand, int speed) {
        this.brand=brand;
        this.speed=speed;
    }

    public Vehicle() {
    }

    // Encapsulation: Getter & Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }

    // Method Overloading
    public void start(String keyType) {
        System.out.println("Vehicle is starting with "+keyType+" key.");
    }

    // Method that can be overridden
    public void showDetails() {
        System.out.println("Brand: "+brand+", Speed: "+speed+ " km/h");
    }
}
