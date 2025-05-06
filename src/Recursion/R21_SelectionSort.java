package Recursion;

public class R21_SelectionSort {

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

        int minIndex =i;

        for(int j=i;j<arr.length;j++){
            if(arr[j]<arr[minIndex]){
                minIndex=j;
            }
        }

        int temp = arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;

        sort(arr,i+1);

    }
}
