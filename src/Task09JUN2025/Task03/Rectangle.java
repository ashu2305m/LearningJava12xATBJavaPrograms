package Task09JUN2025.Task03;

public class Rectangle {
    public static void main(String[] args) {
          Rectangle rr = new Rectangle(10,12);
          rr.Cal_Area();
    }

    float length;
    float breadth;
    float Area;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void Cal_Area(){
        Area = length*breadth;
        System.out.println("Area of Rectangle is -> "+Area);
    }
}
