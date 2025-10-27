package Practice;

import java.util.HashMap;
import java.util.Map;

public class StringQuestion5_DuplicateCharacters {
    public static void main(String[] args) {
        String str= "programming";

        char [] arr = str.toCharArray();
        Map<Character,Integer> map= new HashMap<Character, Integer>();
        for(Character element : arr) {
            Integer count = map.get(element);
            if(count == null) {
                map.put(element, 1);

            }else {
                map.put(element,++count);
            }

        }
        //printing map with for each loop
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println("The occurence of element "+entry.getKey()+" is "+ entry.getValue());
            if(entry.getValue()>1){
                System.out.println("Duplicate Element is ->" +entry.getKey());
            }
        }
    }
}
