import java.util.Scanner;
public class Task13 {
    public static void printXPattern (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();

        printXPattern(n);
    }
}
