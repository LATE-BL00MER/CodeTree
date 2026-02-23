import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] countArr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 개수 세기
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }

        // 개수 출력
        for (int i = 1; i < 10; i++) {
            System.out.println(countArr[i]);
        }
    }
}