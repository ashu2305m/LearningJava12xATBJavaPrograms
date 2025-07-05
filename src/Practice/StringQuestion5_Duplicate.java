package Practice;

/*Remove duplicated from string*/
public class StringQuestion5_Duplicate {
    public static void main(String[] args) {
        String str = "ABABCCAB";
        String result = "";

        for(int i=0; i<str.length(); i++){
            String ch = ""+str.charAt(i);
            if(result.contains(ch)){  // result.contains() only checks for string so ch is stored in string
                continue;
            }
            result = result+ch;
        }
        System.out.println(result);

        // Another method to remove duplicates in String

        for (char ch : str.toCharArray()) {
// Convert the char 'ch' to a String before checking if 'result' contains it
            String charAsString = String.valueOf(ch); // Or use "" + ch;

            if (result.contains(charAsString)) {
                continue; // If the character is already in result, skip to the next iteration
            }
            result = result + charAsString; // Add the unique character to the result string
        }
        System.out.println(result);

    }
}

