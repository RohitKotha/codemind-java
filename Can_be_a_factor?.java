import java.util.*;

public class Rohit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        
        for (long i = 0; i < n; i++) {
            long x = sc.nextInt();
            long y = sc.nextInt();
            boolean found = false;
            
            for (long j = 0; j <= 1000; j++) {  // You can adjust the upper limit as needed
                if ((y) % (x) == 0) {
                    System.out.println("YES");
                    found = true;
                    break;
                }
                else{
                    long w=y%x;
                    y+=w;
                    x+=w;
                }
            }
            
            if (!found) {
                System.out.println("NO");
            }
        }
    }
}
