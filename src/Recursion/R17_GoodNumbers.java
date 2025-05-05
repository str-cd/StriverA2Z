package Recursion;

public class R17_GoodNumbers {
    static int MOD = 1_000_000_007;
    public static void main(String[] args) {
        System.out.println(goodNumber(4));
    }
    public static int goodNumber(int n){
        int evenCount = (n + 1) / 2;
        int oddCount = n / 2;

        long evenPower = powerRecursive(5, evenCount);
        long oddPower = powerRecursive(4, oddCount);

        return (int)((evenPower * oddPower) % MOD);
    }

    public static long powerRecursive(long base, int exp) { //recursive program of power(a,b)
        if (exp == 0) return 1;
        long half = powerRecursive(base, exp / 2);
        long result = (half * half) % MOD;
        if (exp % 2 == 1) result = (result * base) % MOD;
        return result;
    }
}
