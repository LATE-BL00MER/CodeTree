import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int year_cnt = 0; // n년 까지의 윤년의 횟수

        /*
        4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년입니다.
        단, 예외적으로 100으로 나누어 떨어지되 400으로 나누어 떨어지지 않는 해는 평년으로 합니다.
         */

        // 1년부터 n년 까지 이므로 시작은 1부터 시작 등호는 <=
        for (int i = 1; i <= n; i++) {
            if (((i % 4) == 0 && (i % 100) != 0) || (i % 400) == 0) {
                year_cnt++;
            }
        }
        System.out.print(year_cnt);
    }
}