package Tasks;

public class Task23_Array_MinNumber {
    public static void main(String[] args) {
        int[] num={10,23,43,56,67,83,98};
        int min= num[0];

        for(int i=0;i<num.length;i++){
            if(min>num[i]){
                min=num[i];
            }
        }
        System.out.println("Min is ->" +min);
    }
}
