import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        //Initializing variables
        int num;
        int sum = 0;
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = in.nextInt();

        //Calculation for perfect number
        if (num > 0) {
            for (i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum = sum + i;
                }
            }

            //Printing if the entered number is perfect number or not
            if (sum == num) {
                System.out.println("It is a perfect number:" + num);
            } else {
                System.out.println("It is not a perfect number:" + num);
            }
        }

    }
}
