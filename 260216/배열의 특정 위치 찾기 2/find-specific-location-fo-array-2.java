import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if ((i + 1) % 2 == 0) {
                evenSum += arr[i];
            }

            if ((i + 1) % 2 != 0) {
                oddSum += arr[i];
            }
        }

        System.out.println(Math.abs(evenSum - oddSum));
    }
}