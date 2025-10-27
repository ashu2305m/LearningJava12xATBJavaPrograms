package Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str= "swiss";

        char [] arr = str.toCharArray();
        Map<Character,Integer> map= new LinkedHashMap<>(); // Linked Hashmap bcoz it maintains insertion order
        for(Character element : arr) {
            Integer count = map.get(element);
            if(count == null) {
                map.put(element, 1);

            }else {
                map.put(element,++count);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() ==1){
                System.out.println("The first Non Repeated Character is -> " +entry.getKey());
                break;
            }
        }
    }
}
