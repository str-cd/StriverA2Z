package Recursion;

public class R10_IsArraySorted {

    public static void main(String[] args) {
        int [] arr ={1,5,2,4,7};
        System.out.println(isArraySorted(arr, 0));
    }

    public static boolean isArraySorted(int [] arr,int n){
        if(n==arr.length-1){
            return true;
        }

        if(arr[n]>arr[n+1]){
            return false;
        }

        return isArraySorted(arr,n+1);
    }


}
