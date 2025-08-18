public class Hollow_Rectangle {
    public static void main(String[] args) {
        int n = 4; // number of rows
        int m = 5; // number of columns

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // just space, not println
                }
            }
            System.out.println(); // move to next line after each row
        }
    }

}
