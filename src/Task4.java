public class Task4 {
    public static void main (String[] args) {
        printMatrix(2, 3);
    }
    public static void printMatrix (int n, int m) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
