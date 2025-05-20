package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {

        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
// here we are taking input from the command lines which is--> Go to dropdown above and select
//  Edit configurations then under program arguments type your values, only problem is the values
// will always be in string so if u want integer u will have to convert it into int using parseInt().

        String user_input = args[0];
        System.out.println(user_input instanceof String);
        System.out.println(user_input);

        int age = Integer.parseInt(user_input); // NumberFormatException: For input string: "pramod"
        System.out.println(age);

        String result = (age < 18) ? "Minor" : ( age < 65) ? "Adult" : "Senior Citizen";
        System.out.println(result);


    }
}
