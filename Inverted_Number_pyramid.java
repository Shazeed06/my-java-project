public class Inverted_Number_pyramid {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // move to next line after each row
        }
    }

}
