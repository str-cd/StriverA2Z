package Recursion;

public class R22_InsertionSort {
    public static void main(String[] args) {
        int [] arr= {5,4,3,2,1};
        sort(arr,0);

        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void sort(int [] arr,int i){
        if(i==arr.length){
            return;
        }
        while(i>0 && arr[i-1]>arr[i] ){
            int temp=arr[i -1];
            arr[i-1]=arr[i];
            arr[i]=temp;
            i--;
        }

        sort(arr,i+1);
    }

}
