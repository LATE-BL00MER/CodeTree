import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while(true) {
            int num = sc.nextInt();

            if (num < 25) {
                System.out.print("Higher");
            } else if (num > 25) {
                System.out.print("Lower");
            } else {
                System.out.print("Good");
                break;
            }
        }
    }
}