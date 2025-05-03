package Recursion;

public class R13_BinarySearch {

    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7};

        System.out.println(binarySearch(arr,0,arr.length-1,15));
    }

    public static boolean binarySearch(int [] arr,int l,int r ,int x){

        if(l>r){
            return false;
        }
        int mid = (l+r)/2;

        boolean res;
        if(arr[mid]==x){
            return true;
        }



        else if(arr[mid]<x){
            res =binarySearch(arr,mid+1,r,x);
        }
        else{
            res = binarySearch(arr,l,mid-1,x);
        }

        return res;


    }
}
