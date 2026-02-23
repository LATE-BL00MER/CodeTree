import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int[] arr = new int[10];

        arr[0] = num1;
        arr[1] = num2;

        System.out.print(arr[0] + " " + arr[1] + " ");
        for (int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i - 1]) + (2 * arr[i - 2]);

            System.out.print(arr[i] + " ");
        }
    }
}