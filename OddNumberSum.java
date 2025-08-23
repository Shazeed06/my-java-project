import java.util.*;

public class OddNumberSum {
    public static void PrintSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of odd numbers up to " + n + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintSum(n); // no need to assign to sum here
        sc.close();
    }
}
