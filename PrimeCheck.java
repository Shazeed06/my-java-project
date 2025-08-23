import java.util.Scanner;

public class PrimeCheck {

    // Function to check prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // numbers <= 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // divisible by i, so not prime
            }
        }
        return true; // no divisors found → prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create scanner object
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // read integer input

        if (isPrime(num)) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }

        sc.close(); // close scanner
    }
}
