import java.util.Scanner;

public class CountPrimesInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Ensure that m is not less than 2
        if (m < 2) {
            m = 2;
        }

        int count = countPrimesInRange(m, n);
        System.out.println(count);

        scanner.close();
    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    // Function to count prime numbers in the given range [m, n]
    static int countPrimesInRange(int m, int n) {
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
}
