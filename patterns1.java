import java.util.*;

public class patterns1 {
    public static void main(String[] args) {
        // This is a placeholder for the patterns1 class
        // You can add methods or functionality as needed
        int n = 4; // Example value
        int m = 5;
        for (int i = 1; i <= n; i++) {
            int repeat = (i == 1) ? m : m - i;
            for (int j = 0; j < repeat; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}