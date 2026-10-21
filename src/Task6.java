public class Task6 {
    public static void main (String[] args) {
        int A = 10;
        int B = 30;
        countPrimesInRange(A, B);
    }

    public static void countPrimesInRange(int A, int B) {
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("Prime Count = " + count);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

