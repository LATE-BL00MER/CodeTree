import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int evenCount = 0; // 2의 배수의 개수
        int sum = 0; // 2의 배수들의 합

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                break;
            }

            if (arr[i] % 2 == 0) {
                evenCount++;
                sum += arr[i];
            }
        }
        System.out.print(evenCount + " " + sum);
    }
}