package ex_21_Static;

public class Lab195_Real {
    public static void main(String[] args) {
        ATB1 aa = new ATB1();
        ATB1 aaa = new ATB1();
    }
}
 // IIB is code in block {} which is called everytime an object is created
// SIB is code in a Static block called only once even if hundred objects are created

class ATB1{

    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }

    static {
        System.out.println("Load the class?, I will execute");
    }

    private String name; // non static
    private String phone;
    static String courseName = "ATB12x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocuments(){
        System.out.println("Non Static Method");
        System.out.println(courseName);
    }

    static void doAssignment(){
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("Do Assignment");
    }

}
