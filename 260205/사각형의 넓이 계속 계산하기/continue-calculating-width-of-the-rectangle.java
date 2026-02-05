import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while(true) {
            int width = sc.nextInt();
            int height = sc.nextInt();
            String word =  sc.next();

            int area = width * height;
            System.out.println(area);

            if (word.equals("C")) {
                break;
            }
        }
    }
}