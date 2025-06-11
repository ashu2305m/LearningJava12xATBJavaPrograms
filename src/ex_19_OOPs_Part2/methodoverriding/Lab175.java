package ex_19_OOPs_Part2.methodoverriding;

public class Lab175 {
    public static void main(String[] args) {
        Pramod p = new Pramod(); // since pramod object so it will call pramod home function
        p.home(); // pramod - 3BHK
        p.p1();   // pramod - p1

        Father f1 = new Father(); // since Father object so it will call Father home function
        f1.home(); //Father - 2BHK
        f1.f1();   // Father - f1

        Father f2 = new Pramod(); // since pramod object so it will call pramod home function
        f2.home();  // pramod - 3BHK


    }
}
