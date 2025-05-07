package Recursion;

public class R1_PrintNTimes {

    public static void main(String[] args) {
        printNTimes(5);
    }
    public static void printNTimes(int n){

        if(n==0){
            return;
        }
        printNTimes(n-1); //0

        System.out.println("LoL");
    }
}


