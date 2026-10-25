import java.util.Scanner;
public class Task14 {
    public static String transformDigits (int n) {
        String result = "";

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                digit = digit + 1;

            } else {
                digit = digit - 1;
            }
            result = digit + result;
            n = n / 10;

        }
        return result;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();

        System.out.println(transformDigits(n));
    }
}
