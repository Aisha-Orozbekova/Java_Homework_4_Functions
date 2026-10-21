public class Task3 {
    public static void main(String[] args) {
        printInvertedPyramid(3);
    }

    public static void printInvertedPyramid(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            int starsCount = 2 * (n - i) - 1;
            for (int k = 0; k < starsCount; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}