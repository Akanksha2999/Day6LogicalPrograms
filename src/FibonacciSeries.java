import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Display the message of enter the number
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        //Initialize the variables
        int a = 0;
        int b = 1;

        //Calculating fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.println(a + "");
            int sum = a + b;
            a = b;
            b = sum;
        }

    }
}
