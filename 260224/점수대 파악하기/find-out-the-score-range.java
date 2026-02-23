import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int[] countArr = new int[11];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            }

            // 점수대별로 나눠야 하기 때문에 10으로 나눈 몫을 countArr에 넣어준다
            countArr[(arr[i] / 10)]++;
        }

        for (int i = 10; i >= 0; i --) {
            System.out.println((i * 10) + " - " + countArr[i]);
        }
    }
}