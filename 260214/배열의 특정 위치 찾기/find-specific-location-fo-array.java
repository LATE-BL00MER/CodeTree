import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int evenSum = 0;
        int oddSum = 0;
        int oddCount = 0;
        double avg;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            // 짝수 번째 (2, 4, 6, 8, 10)
            if ((i + 1) % 2 == 0) {
                evenSum += arr[i];
            }

            // 3의 배수 번째 (3, 6, 9)
            if ((i + 1) % 3 == 0) {
                oddSum  += arr[i];
                oddCount++;
            }
        }
        avg = (double)oddSum / oddCount;

        System.out.printf(evenSum + " " + "%.1f",avg);
    }
}