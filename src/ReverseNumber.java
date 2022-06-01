import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        //Initialize the variables
        int num = 0;
        int reversenum = 0;

        //Printing the message to enter the number
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        //Calculation to reverse the original number
        while (num != 0) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }

        //Printing the reversed number
        System.out.println("Reverse of number is:" + reversenum);
    }

}
