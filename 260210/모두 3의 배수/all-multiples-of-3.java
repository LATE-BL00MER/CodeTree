import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        boolean satisfied = true;

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();

            if (n % 3 != 0) {
                satisfied = false;
            }
        }

        if (satisfied) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

