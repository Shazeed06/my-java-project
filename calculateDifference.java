import java.util.*;

public class calculateDifference {
    public static int Calculatedifference(int a, int b) {
        int difference = a - b;
        return difference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diffrence = Calculatedifference(a, b);
        System.out.println("The difference of 2 Number is : " + Calculatedifference(a, b));

    }

}
