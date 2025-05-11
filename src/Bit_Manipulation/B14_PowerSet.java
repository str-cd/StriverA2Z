package Bit_Manipulation;

import java.util.ArrayList;
import java.util.List;

public class B14_PowerSet {

    public static void main(String[] args) {

        int [] nums ={1,2,3};

        List<List<Integer>> li = new ArrayList<>();

        int subset = 1<<nums.length;
        for(int i=0;i<subset;i++){
            List<Integer> l = new ArrayList<>();

            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0){
                    l.add(nums[j]);
                }
            }

            li.add(l);
        }


        System.out.println(li);




    }
}
