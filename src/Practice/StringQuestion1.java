package Practice;

/*Write the java program for given input String = Ravi Teja Bompally, the output should be R.T.Bompally*/
public class StringQuestion1 {
    public static void main(String[] args) {
                String input = "Ravi Teja Bompally";
                String[] words = input.split(" ");

                StringBuilder result = new StringBuilder();
                for (int i = 0; i < words.length - 1; i++) {  // i = 0,1
                    result.append(words[i].charAt(0)).append(".");

                }
                result.append(words[words.length - 1]); // Last name in full

                System.out.println(result.toString());
            }
        }
