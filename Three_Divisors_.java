import java.util.*;

public class goodgame {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;

        for (int i = 1; i <= n; i++) {
            if (isPerfectSquare(i) && isPrime((int) Math.sqrt(i))) {
                k++;
            }
        }

        System.out.print(k);
    }

    // Function to check if a number is a perfect square
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
