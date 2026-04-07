import java.util.*;

public class LCM {
    public static int findGCD(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            }
            if (num2 > num1) {
                num2 -= num1;
            }
        }
        return num1;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (i > 0) {
                int lcm = arr[i - 1] * arr[i];
                int gcd = findGCD(arr[i - 1], arr[i]);
                max = Math.max(max, lcm / gcd);
            }
        }
        System.out.println(max);
    }
}
