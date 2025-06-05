package Tasks;

public class Task24_Arrays_Sum {
    public static void main(String[] args) {
        int[] num={10,22,34,56,68,89};
        int sum=0;

        for(int i=0; i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println("Sum of All Numbers is ->" +sum);
    }
}
