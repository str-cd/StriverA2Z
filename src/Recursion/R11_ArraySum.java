package Recursion;

public class R11_ArraySum {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(arraySum(arr,0));
    }

    public static int arraySum(int [] arr,int i){
        if(i==arr.length){
            return 0;
        }
        return arr[i] + arraySum(arr,i+1);
    }

}
