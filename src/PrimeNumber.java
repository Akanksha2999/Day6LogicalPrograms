import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Printing the message to enter the number
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int count = 0;

        //Calculation to check if the number is prime number or not
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            //Printing number is prime or not
            if (count == 2) {
                System.out.println("Number is prime");
            }
            if (count > 2) {
                System.out.println("Number is not prime");
            }
        }
    }
}
