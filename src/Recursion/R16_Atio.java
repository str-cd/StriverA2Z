package Recursion;

public class R16_Atio {

    public static void main(String[] args) {
        String str = "-1234";
        int start =0;
        int end =str.length()-1;
        if(str.charAt(0)=='-'){
            start=1;
        }

        int value = atio("1234",0,3);

        if(start==1){
            value*=-1;
        }
        System.out.println(value);
    }

    public static int atio(String str ,int start,int end){

        if(start>end){
            return 0;
        }

        int smaller_Value =atio(str,start+1,end);

        int value  = str.charAt(start) - '0';
        return value * (int)Math.pow(10,end-start)+smaller_Value;
    }

}

