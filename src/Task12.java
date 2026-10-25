import java.util.Scanner;
public class Task12 {
    public static int reverseNumber (int n) {
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        return reversed;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();

        System.out.println(reverseNumber(n));

    }
}
