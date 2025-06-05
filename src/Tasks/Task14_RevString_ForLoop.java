package Tasks;

public class Task14_RevString_ForLoop {
    public static void main(String[] args) {
        String str = "Ashutosh";

        for (int i= str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
