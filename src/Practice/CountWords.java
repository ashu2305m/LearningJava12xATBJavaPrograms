package Practice;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String str= "I am  am learning learning java java java programming";

        //Split() method returns array of string
        //declaring hash map
        Map<String,Integer> map= new HashMap<String, Integer>();

        String[] arr= str.split(" ");  // returns a set of string Arrays
        for(String word : arr) {
            Integer count = map.get(word);
            if(count == null) {
                map.put(word, 1);

            }else {
                map.put(word,++count);
            }

        }
        //printing map with for each loop
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("The occurence of element "+entry.getKey()+" is "+ entry.getValue());
        }

    }
}
