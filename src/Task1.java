import java.util.Scanner;
public class Task1 {
    static void printStrip(int n, char symbol) {
        for (int i = 0; i <= n; i++) {
            System.out.print(symbol);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printStrip(n, '#');
    }
}



