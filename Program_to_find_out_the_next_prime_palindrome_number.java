import java.util.*;

public class GoodGame {
    static int prime(long k) {
        if (k <= 1) {
            return 2; // Handle non-prime cases
        }
        
        for (long i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) {
                return 2; // Not a prime number
            }
        }
        return 1; // Prime number
    }

    static long reve(long op) {
        long r = 0, rem = 0;
        while (op > 0) {
            r = op % 10;
            rem = rem * 10 + r;
            op /= 10;
        }
        return rem; // Return the reversed number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long i=n+1;
        while(true){
            if (prime(i) == 1) {
                if (reve(i) == i) {
                    System.out.print(i);
                    break; // Found a palindromic prime, exit the loop
                }
            }
            i++;
        }
    }
}
