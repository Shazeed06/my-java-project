import java.util.*;

public class FindAverage {
    public static int FindAverage(int a, int b, int c) {
        int Average = (a + b + c) / 3;
        return Average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Average = FindAverage(a, b, c);
        System.out.println("The Average of 3 Number is : " + Average);
    }

}
