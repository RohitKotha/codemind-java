import java.util.*;

public class RohitImproved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean found = false;

        for (long i = 1; i * i <= n; i++) {
            long jSquare = n - i * i;
            long j = (long) Math.sqrt(jSquare);

            if (j * j == jSquare) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
