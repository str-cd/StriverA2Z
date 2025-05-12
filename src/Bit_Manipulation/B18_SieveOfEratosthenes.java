package Bit_Manipulation;

import java.util.ArrayList;
import java.util.Arrays;

public class B18_SieveOfEratosthenes {

    public static void main(String[] args) {
        int n=10;
        ArrayList<Integer> li = sieveOfEratosthenes(10);
        System.out.println(li);
    }

    static ArrayList<Integer> sieveOfEratosthenes(int n) {
        // code here
        ArrayList<Integer> li = new ArrayList<>();

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <=n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <=n; j += i) {
                    isPrime[j] = false;
                }
            }
        }


        for (int i = 2; i <= n; i++) {
            if (isPrime[i])
                li.add(i);

        }

        return li;
    }
}
