public class Number_triangle {
    public static void main(String[] args) {
        int n = 5; // You can change this value to increase or decrease the size of the triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // move to next line after each row

        }

    }
}
