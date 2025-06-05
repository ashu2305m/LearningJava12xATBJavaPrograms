package Tasks;

public class Task125_Odd_Even {
    public static void main(String[] args) {
        int[] num={10,23,42,55,67,78,99};
        int Even=0;
        int Odd=0;

        for(int i=0;i<num.length;i++){
            if(num[i]%2 ==0){
                System.out.println("Even Numbers ->" +num[i]);
            }else{
                System.out.println("Odd Numbers ->" +num[i]);
            }
        }
    }

}

 /*for(int i =0;i< arr.length;i++){
        if(arr[i]%2==0)
        System.out.println(arr[i] + " is even");
            else
                 System.out.println(arr[i]+ " is odd");
        }*/
