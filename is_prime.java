package Leetcode;

public class is_prime {
    public void printPrime(long n){
        for (long i = 1; i <= n; i++) {
            boolean isPrime = true;

            for (long j = 2; j < Math.sqrt(i) ; j++) {

                if ((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] arg){
        long startTime = System.currentTimeMillis();
        is_prime res = new is_prime();
        res.printPrime(100000000);
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
    }
}
