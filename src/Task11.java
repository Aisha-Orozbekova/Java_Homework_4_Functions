import java.util.Scanner;
public class Task11 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("LCM = " + lcm(a, b));
    }
    public static int gcd (int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
