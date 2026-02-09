import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean satisfied = false;

        for (int i = 2; i < n-1; i++) {
            if (n % i == 0) {
                satisfied = true;
            }
        }

        if (satisfied == false) {
            System.out.println("P");
        } else {
            System.out.println("C");
        }
    }
}