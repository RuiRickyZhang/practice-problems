package Leetcode;

import java.util.ArrayList;

public class count_prime {

    public int countPrimes(int n) {
        int count = 0;
        ArrayList<Integer> primes = new ArrayList<>();
        if(n <= 2)  return count;

        else {
            //Smaller than 4, there must be 2 primes: 2 and 3;
            count = n-1;
            for(int i = 2; i <= Math.sqrt(n);++i){
                for(int j = 2; j <= Math.sqrt(n); ++j){
                   count = count - 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args){
        count_prime result = new count_prime();
        System.out.println(result.countPrimes(3));
    }

}
