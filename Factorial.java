import java.util.*;

public class Factorial {

    public static void Printfactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorila = 1;
        for (int i = n; i >= 1; i--) {
            factorila = factorila * i;
        }
        System.out.println(factorila);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Printfactorial(n);
    }

}
