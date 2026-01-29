import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double avg = 0;

        for (int i = 0; i < 10; i++) {
            int  num = sc.nextInt();

            if (num >= 0 && num <= 200) {
                sum += num;
                count++;

                avg = (double) sum / count;
            }
        }
        System.out.printf(sum + " " + "%.1f", avg);
    }
}