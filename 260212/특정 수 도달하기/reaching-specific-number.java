import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        double sum = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] >= 250) {
                break;
            }
            sum += arr[i];
            cnt++;
        }

        System.out.print(sum + " " + (sum / cnt));
    }
}