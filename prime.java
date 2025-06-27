public class prime {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " " + (isPrime(i) ? "Prime" : "Not Prime"));
        }
    }
    static boolean isPrime(int num) {
        if (num < 2) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
