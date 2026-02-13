import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                count = i;
                break;
            }

            count = i + 1;
        }

        // 배열의 크기가 아닌 실제로 입력된 개수부터 시작
        for (int j = count - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}