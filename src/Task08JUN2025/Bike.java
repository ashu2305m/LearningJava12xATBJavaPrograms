package Task08JUN2025;

public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, int speed, boolean hasCarrier) {
        this.setBrand(brand);
        this.setSpeed(speed);
        this.hasCarrier=hasCarrier;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Has Carrier: "+this.hasCarrier);
    }
}
