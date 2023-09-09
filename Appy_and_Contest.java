import java.util.Scanner;

public class ContestWinning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            long N = scanner.nextLong();
            long A = scanner.nextLong();
            long B = scanner.nextLong();
            long K = scanner.nextLong();

            String result = canWin(N, A, B, K);
            System.out.println(result);
        }

        scanner.close();
    }

    static String canWin(long N, long A, long B, long K) {
        long divisibleByA = N / A;
        long divisibleByB = N / B;
        long divisibleByBoth = N / (A * B);

        long problemsSolvedByFranklin = divisibleByA - divisibleByBoth;
        long problemsSolvedByVenkat = divisibleByB - divisibleByBoth;

        long totalProblemsSolved = problemsSolvedByFranklin + problemsSolvedByVenkat;

        if (totalProblemsSolved >= K) {
            return "Win";
        } else {
            return "Lose";
        }
    }
}
