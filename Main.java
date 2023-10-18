import java.util.Scanner;
import java.io.IOException;

public class Main {
    private static Scanner sc;

    public static boolean verification(int num) {
        if (num < 0) {
            System.out.println("Error: You can't start depo from negative value");
            return false;
        }

        if (num == 0) {
            System.out.println("Error: You can't start depo from 0");
            return false;
        } else if (num < 1000) {
            System.out.println("Error: minimal start amount should be 1000UAH");
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("What is your start amount?");
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        if (!verification(num)) {
            if (num < 0) {
                return;

            }
            if (num == 0) {
                return;
            } else if (num < 1000) {
                return;
            }
            sc.close();
            in.close();
        }
        verification(num);
        {
            if (num < 20000) {
                int sum1 = (int) ((num * 0.16 / 3 * 4) + num);
                System.out.println(sum1);
                System.out.println("You can choose PrivatBank");
            } else {
                int sum1 = (int) ((num * 0.16 / 3 * 4) + num);
                int sum2 = (int) ((num * 0.12 / 3 * 4) + num + 500);
                System.out.println("Your amount, when You choose PrivatBank:");
                System.out.println(sum1);
                System.out.println("Your amount, when You choose OTP-Bank");
                System.out.println(sum2);
                System.out.println("What bank do You prefer?");

            }
            sc.close();
            in.close();
        }

    }
}