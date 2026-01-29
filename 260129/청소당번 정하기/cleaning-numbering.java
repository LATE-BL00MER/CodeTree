import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int class_cnt1 = 0; // 교실 청소 횟수
        int hallWay_cnt2 = 0; // 복도 청소 횟수
        int bathroom_cnt3 = 0; // 화장실 청소 횟수

        for (int i = 1; i <= n; i++) {
            if ((i % 12) == 0) {
                bathroom_cnt3++;
            } else if ((i % 3) == 0) {
                hallWay_cnt2++;
            } else if ((i % 2) == 0) {
                class_cnt1++;
            }
        }
        System.out.print(class_cnt1 + " " + hallWay_cnt2 + " " + bathroom_cnt3);
    }
}