package Task08JUN2025;

public class VehicleLab {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Generic", 100);
        vehicle.showDetails();
        vehicle.start();
        vehicle.start("Automatic");

        System.out.println(" ======= ");

        Car car = new Car("Toyoto",180,4);
        Bike bike = new Bike("Yamaha",120,true);

        Vehicle v1 = car;
        Vehicle v2 = bike;

        v1.showDetails();
        car.start();
        car.start("Smart");
        car.drive();
        car.drive("Eco");

        System.out.println(" ======= ");

        v2.showDetails();
        bike.start();
        bike.start("Auto");
        bike.setSpeed(150);
        System.out.println("Updated Bike Speed: "+ bike.getSpeed());

    }
}