import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
         Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();

        /*
        a + n = sum
        sum + n = sum1
        sum1 + n = sum2
        .
        .
        .
        이런 식으로 더해져야 함
         */

        for (int i = 0; i < n; i++) {
            System.out.println(a += n); // a = a + n
        }
    }
}