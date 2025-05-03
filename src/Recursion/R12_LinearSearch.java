package Recursion;

public class R12_LinearSearch {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8};

        System.out.println(linearSearch(arr,12,0));
    }

    public static boolean linearSearch(int [] arr ,int x,int i){
        if(i==arr.length){
            return false;
        }

        if(arr[i]==x){
            return true;
        }

        return linearSearch(arr,x,i+1);

    }
}
