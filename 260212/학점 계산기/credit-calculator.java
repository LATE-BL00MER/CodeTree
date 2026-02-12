import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] arr = new double[n];
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        System.out.printf("%.1f", (sum / arr.length));
        System.out.println();

        if ((sum / arr.length) >= 4.0) {
            System.out.println("Perfect");
        } else if ((sum / arr.length) >= 3.0) {
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }
    }
}