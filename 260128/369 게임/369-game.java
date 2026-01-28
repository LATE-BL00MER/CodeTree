import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // 3의 배수이거나 숫자에 3, 6, 9가 하나라도 들어가있다면 0 출력
            if (i % 3 == 0 || (i-3) % 10 == 0 || (i-6) % 10 == 0 || (i-9) % 10 == 0
            || (i / 10) % 10 == 3 || (i / 10) % 10 == 6 || (i / 10) % 10 == 9)  {
                System.out.print(0+ " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}