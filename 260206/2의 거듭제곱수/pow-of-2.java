import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x= 1;

        // 2의 거듭제곱수 중 하나인 N을 입력받아,
        // N=2ⁿ(2의 n제곱)를 만족하는 n 값을 구하는 코드

        /*
        핵심은 거꾸로 가기 or 계속 곱하기
        나눗셈을 이용한 반복
        -> N이 1이 될때까지 반복, 그럴때마다 x 1 증가
        최종 결과가 값
         */
        while (n > 2) {
            n /= 2;
            x++;
        }
        System.out.println(x);
    }
}