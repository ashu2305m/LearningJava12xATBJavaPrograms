package Task12JUN2025.Task5_MethodOverriding;

public class Daughter extends Mother{
    public static void main(String[] args) {
        Daughter dd = new Daughter();
        dd.home();
        dd.jewellery();

        Mother mm = new Mother();
        mm.home();
        mm.jewellery();

        Mother mm1 = new Daughter();
        mm1.jewellery();
        mm1.home();
    }

    void home(){
        System.out.println("Daughter home- 3BHK");
    }

    void jewellery(){
        System.out.println("Daughter Gold Jewellery");
    }
}
