package Practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsArray_part02 {
    public static void main(String[] args) {
        String names[]= {"Java","javaScript","Ruby","C","Python","Java","C"};
        Map<String,Integer> storeMap=new HashMap<String, Integer>();
        for(String name:names){
            Integer count= storeMap.put(name, 1);
            if(count!=null){
                System.out.println("Duplicate element is:::"+name);
            }
        }
    }
}

/*   String[] dupArray={"Mumbai","Chennai","Delhi","Kochi","Chennai","Kochi","Trivandrum","Delhi"};
     Map<String,Integer> myMap=new HashMap<>();
     int counter=0;
        for (String city:dupArray) {
        if(myMap.put(city,++counter)!=null){
        System.out.println("Duplicate Value="+city);
            }
                    }*/
