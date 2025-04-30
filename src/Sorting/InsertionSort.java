package Sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int [] arr = {22,33,44,55,11};

        int n=arr.length;

        for(int i=0;i<n;i++){
            int j=i;

            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }

        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
