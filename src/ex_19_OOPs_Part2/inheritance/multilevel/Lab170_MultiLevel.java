package ex_19_OOPs_Part2.inheritance.multilevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
        Son pramod = new Son();
        pramod.gf();
        pramod.bhk3();
        pramod.extra();
        pramod.home();
        Father f = new Father();
        f.extra();
        f.home();
        f.gf();
        GrandFather gf =  new GrandFather();
        gf.gf();
        gf.home();

        Son s1 = new Son();
        //Son s2 = new Father();
        Father f1 = new Son(); // Dynamic Dispatch.
        f1.gf();
        f1.home();
        f1.extra();
        GrandFather gf1 = new Son();
        gf1.gf();
        gf1.home();
        GrandFather gf2 = new Father();
        gf2.home();
        gf2.gf();

//        Son s3 = new GrandFather();





    }
}