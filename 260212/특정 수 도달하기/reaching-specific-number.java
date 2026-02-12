import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
         Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        double cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] >= 250) {
                break;
            }
            sum += arr[i];
            cnt++;
        }

        System.out.print(sum + " " + (double)(sum / cnt));
    }
}