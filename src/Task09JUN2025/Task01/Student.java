package Task09JUN2025.Task01;

public class Student {
    public static void main(String[] args) {
        Student ss = new Student("Ashu", 27);
        ss.Display();

    }
    String name;
    int age;

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    void Display(){
        System.out.println("Name of Student is: "+name);
        System.out.println("Age of Student is: " +age);
    }
}
