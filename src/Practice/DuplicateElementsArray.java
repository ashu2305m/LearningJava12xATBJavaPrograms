package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsArray {
    public static void main(String[] args) {

        String names[] = {"Java", "Javascript", "Ruby", "Python", "Java", "Ruby"};

      //  1. compare each element: o(n*n)----- worst solution
        for(int i=0; i<names.length; i++){
            for(int j= i+1; j<names.length; j++){
                if(names[i].equals(names[j])){
                    System.out.println("Duplicate Element is ->" +names[i]);
                }
            }
        }

        System.out.println("**************************");

        // 2. using HashSet: java collection : it stores unique values: o(n)
        Set<String> store = new HashSet<String>();
        for(String name : names){
            if(store.add(name) == false){
                System.out.println("Duplicate Element is ->" +name);
            }
        }
        System.out.println("**************************");

        // 3. using HashMap:

        Map<String,Integer> element = new HashMap<>();

        for(String name : names){
            Integer count = element.get(name);
            if(count == null){
                element.put(name,1);
            }
            else{
                element.put(name, ++count);
            }
        }

        // get the values from this HashMap:

        Set<Entry<String,Integer>> entrySet = element.entrySet();  // special method called entrySet is used to iterate elements i.e., key and value pair
        for(Entry<String,Integer> entry : entrySet) {
            if(entry.getValue()>1){
                System.out.println("Duplicate Element is ->" +entry.getKey());
            }
            System.out.println("The occurence of element "+entry.getKey()+" is "+ entry.getValue()); // occurence of every element
        }

    }
}
