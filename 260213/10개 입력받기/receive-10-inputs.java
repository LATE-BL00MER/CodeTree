import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;
        int sum = 0;
        double avg;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];

            if (arr[i] == 0) {
                count = i;
                break;
            }

            count = i + 1;
        }

        avg = (double)sum / count;

        System.out.printf(sum + " " + "%.1f", avg);
    }
}