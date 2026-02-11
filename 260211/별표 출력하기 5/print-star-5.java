import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 바깥 for문은 몇줄을 출력할지
        // 안쪽 for문은 한 줄에 몇개씩 출력할지

        /*
        현재 줄 번호에서 n을 곱해서 각 줄에 출력?
        근데 그럴려면 for문을 또 써야 하는데?

         */

        // 몇 줄을 출력할지
        for (int i = n; i >= 1; i--) {
            // 한 줄에 몇 묶음을 반복할 것인지
            for (int j =  0; j < i; j++) {
                // 한 묶음 안에 별을 몇 개 넣을지
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }

                // 묶음 사이에 공백으로 표기
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}