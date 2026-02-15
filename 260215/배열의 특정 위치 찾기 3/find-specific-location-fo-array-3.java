import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
            if (arr[i] == 0) {
                n = i;
                break;
            }

        }

        System.out.println(arr[n - 1] + arr[n - 2] + arr[n - 3]);
    }
}