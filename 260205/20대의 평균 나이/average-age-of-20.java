import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        double avg;

        while(true) {
            int age = sc.nextInt();

            if (age >= 20 && age < 30) {
                count++;
                sum += age;
            } else {
                avg = (double) sum / count;
                System.out.printf("%.2f", avg);
                break;
            }
        }
    }
}