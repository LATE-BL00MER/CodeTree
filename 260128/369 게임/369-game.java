import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || (i-3) % 10 == 0 || (i-6) % 10 == 0 || (i-9) % 10 == 0)  {
                System.out.print(0 + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}