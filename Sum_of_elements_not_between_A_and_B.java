import java.util.Scanner;

public class SumOfElementsNotBetweenAB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int N = scanner.nextInt();

       
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

       
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int totalSum = 0;

        for (int num : arr) {
            
            if (num < A || num > B) {
                totalSum += num;
            }
        }

       
        System.out.println(totalSum);

        
    }
}
