package Task08JUN2025;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand,int speed, int doors) {
        this.setBrand(brand);
        this.setSpeed(speed);
        this.doors=doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    // Method Overriding
    @Override
    public void showDetails() {
        super.showDetails(); // calling parent's method using super keyword
        System.out.println("Doors: "+this.doors);
    }

    // Method Overloading in the Child class
    public void drive() {
        System.out.println("Car is being driven manually.");
    }

    public void drive(String mode) {
        System.out.println("Car is being driven in "+mode+" mode.");
    }
}
