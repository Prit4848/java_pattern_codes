import java.util.Scanner;

public class continue_use {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 9: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            if (i == n) {
                continue;
            }
            System.out.println(i);
        }
    }
}
