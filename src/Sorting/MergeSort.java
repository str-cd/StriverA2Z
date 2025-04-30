package Sorting;

import java.util.ArrayList;

public class MergeSort {

    public static void main(String[] args) {

        int [] arr = {52,48,69,7,85,22,67};

        mergeSort(arr,0,arr.length-1);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void mergeSort(int [] arr ,int low,int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void merge(int [] arr, int low,int mid,int high){

        int left1 = low;

        int left2 = mid+1;

        ArrayList<Integer> li = new ArrayList<>();

        while(left1<=mid && left2<=high){

            if(arr[left1]<arr[left2]){
                li.add(arr[left1]);
                left1++;
            }
            else{
                li.add(arr[left2]);
                left2++;
            }

        }

        while(left1<=mid){
            li.add(arr[left1]);
            left1++;
        }

        while(left2<=high){
            li.add(arr[left2]);
            left2++;
        }

        for(int i=0;i<li.size();i++){
            arr[low + i] = li.get(i);
        }
    }
}
