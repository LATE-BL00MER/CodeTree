import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a =  sc.nextInt();
        int b =  sc.nextInt();

        /*
        a / b에서 소수점을 수학적으로 구하는 방법은,
        a를 b로 나눈 나머지에 10을 곱한 값을 b로 나눴을 때의 몫을
        순서대로 적는 것을 계속해서 반복하면 된다.
         */

        // 정수 출력
        System.out.print(a / b);

        // 소수점 출력
        System.out.print(".");

        // 나머지를 업데이트
        a %= b;

        // 소수점 20번째 자리까지 반복
        for (int i = 0; i < 20; i++) {
            a *= 10; // 나머지에 10 곱하기

            // 현재 자리수의 숫자(몫)을 출력
            System.out.print(a / b);

            a %= b; // 다시 나머지를 구해서 루프로 전달
        }
    }
}