package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {4,2,1,6,8,9,5,2};

        int n= arr.length;

        for(int i=0;i<n-1;i++){
            int miniIndex=i;

            for(int j=i;j<n;j++){
                if(arr[j]<arr[miniIndex]){
                    miniIndex=j;
                }
            }

            int temp =arr[i];
            arr[i]=arr[miniIndex];
            arr[miniIndex]=temp;
        }


        for(int i:arr){
            System.out.print(i+" ");
        }

    }


}
