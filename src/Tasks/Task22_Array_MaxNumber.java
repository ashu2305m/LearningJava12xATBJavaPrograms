package Tasks;

public class Task22_Array_MaxNumber {
    public static void main(String[] args) {
        int [] num ={11,21,33,65,87,99};
        int max=num[0];

        for(int i=0;i< num.length;i++){  // OR for(int i=0;i<= num.length-1;i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println("Max is-> " + max);
    }
}
