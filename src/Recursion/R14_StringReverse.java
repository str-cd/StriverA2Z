package Recursion;

public class R14_StringReverse {
    public static void main(String[] args) {
        String str ="Vikas";

        System.out.println(rev(str));
    }

    public static String rev(String str){
        if(str.length()==1){
            return str;
        }

        return rev(str.substring(1))+ str.charAt(0);
    }

}
