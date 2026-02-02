import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        // 친근한 수인 경우 아래의 카운트 로직을 건너뛰고 다음 숫자로 넘어간다.

        for (int i = 1; i <= n; i++) {
            if ((i % 2) == 0 || (i % 3) == 0 || (i % 5) == 0) {
                continue;
            }
            count++;
        }

        System.out.println(count);
    }
}