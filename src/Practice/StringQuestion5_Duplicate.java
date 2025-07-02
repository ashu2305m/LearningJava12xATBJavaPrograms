package Practice;

/*Remove duplicated from string*/
public class StringQuestion5_Duplicate {
    public static void main(String[] args) {
        String str = "ABABCCAB";
        String result = "";

        for(int i=0; i<str.length(); i++){
            String ch = ""+str.charAt(i);
            if(result.contains(ch)){
                continue;
            }
            result = result+ch;
        }
        System.out.println(result);
    }
}
