import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[10];
        int count = 0; // 5의 배수 갯수 찾기

        for (int i = 0; i < arr.length; i++) {
            arr[i] = n * (i + 1);

            if (arr[i] % 5 == 0) {
                count++;
            }

            System.out.print(arr[i] + " ");

            if (count == 2) {
                break;
            }
        }
    }
}