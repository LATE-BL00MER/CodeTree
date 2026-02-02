import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        int sum = 0;
        double avg;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        avg = (double) sum / count;

        System.out.print(sum + " " + avg);
    }
}