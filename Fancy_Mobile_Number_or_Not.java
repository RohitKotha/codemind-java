import java.util.Scanner;

public class FancyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mobileNumber = scanner.nextLine();
        scanner.close();

        if (mobileNumber.length() != 10) {
            System.out.println(-1);
            return;
        }

        boolean isFancy = false;

        // Condition 1: Any digit occurs three times consecutively.
        for (int i = 0; i <= mobileNumber.length() - 3; i++) {
            if (mobileNumber.charAt(i) == mobileNumber.charAt(i + 1) && mobileNumber.charAt(i) == mobileNumber.charAt(i + 2)) {
                isFancy = true;
                break;
            }
        }

        // Condition 2: Any three consecutive digits are in increasing or decreasing fashion.
        for (int i = 0; i <= mobileNumber.length() - 3; i++) {
            int num1 = mobileNumber.charAt(i) - '0';
            int num2 = mobileNumber.charAt(i + 1) - '0';
            int num3 = mobileNumber.charAt(i + 2) - '0';
            
            if ((num1 == num2 - 1 && num2 == num3 - 1) || (num1 == num2 + 1 && num2 == num3 + 1)) {
                isFancy = true;
                break;
            }
        }

        // Condition 3: Any digit occurs at least 5 times in the number.
        for (char digit = '0'; digit <= '9'; digit++) {
            if (countOccurrences(mobileNumber, digit) >= 5) {
                isFancy = true;
                break;
            }
        }

        if (isFancy) {
            System.out.println("FANCY NUMBER");
        } else {
            System.out.println("NOT A FANCY NUMBER");
        }
    }

    public static int countOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
