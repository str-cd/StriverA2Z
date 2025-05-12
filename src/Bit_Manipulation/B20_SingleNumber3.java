package Bit_Manipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class B20_SingleNumber3 {

    public static void main(String[] args) {
        int [] nums = {1,2,1,3,2,5};
        //Brute Force
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//
//        for(int i:nums){
//            if(map.containsKey(i)){
//                map.put(i, map.get(i)+1);
//            }
//            else{
//                map.put(i,1);
//            }
//        }
//
//        ArrayList<Integer> li = new ArrayList<>();
//
//        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
//            if(mapElement.getValue()==1){
//                li.add(mapElement.getKey());
//            }
//        }
//
//        System.out.println(li);

        int xor = 0;

        for(int i:nums){
            xor =xor^i;
        }

        int rightmostBitValue = (xor&xor-1)^xor;

        int bit1 =0;
        int bit0 =0;

        for(int i:nums){
            if((i&rightmostBitValue)>0){
                bit1=bit1^i;
            }
            else{
                bit0=bit0^i;
            }
        }

        System.out.println(bit1);
        System.out.println(bit0);

    }
}
