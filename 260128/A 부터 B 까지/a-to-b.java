import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b  = sc.nextInt();

        int i = a;
        System.out.print(i + " ");
        while (i < b) {
            if (i % 2 == 1) {
                i *= 2;
            } else {
                i += 3;
            }

            if (i <= b) {
                System.out.print(i + " ");
            }
        }
    }
}