package Recursion;

public class R6_ReverseArray {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        reverse(arr,0,arr.length-1);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void reverse(int [] arr, int l , int r){

        if(l>r){
            return;
        }

        int temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;

        l++;
        r--;

        reverse(arr,l,r);

    }
}
