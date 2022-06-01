import java.util.Scanner;

public class CouponNumber {
    //to initialize the static variables
    static int array[] = new int[20];
    static int COUNTER_FOR_NUMBERS = 0;
    static int COUNTER_FOR_DISTINCTS = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //to print the message of how many random coupons to generate
        System.out.println("Enter how many random coupons do you want to generate");
        int total = scanner.nextInt();
        randomNumberGenerate(total);

        //to print the message of distinct coupons are
        System.out.println("Distinct coupons are:");
        processDistinctCoupon(total);
        System.out.println();
        System.out.println(" Total coupon generated " + COUNTER_FOR_NUMBERS + " times for " + COUNTER_FOR_DISTINCTS + " Distinct coupon number ");
    }

    //Generate random number between 1 to 10
    public static void randomNumberGenerate(int n) {
        for (int i = 0; i < n; i++) {
            array[i] = (int) Math.floor(Math.random() * 10 + 1);
            System.out.println(array[i] + " ");
            COUNTER_FOR_NUMBERS++;
        }
    }

    //To chcek distinct numbers among the random numbers generated
    public static void processDistinctCoupon(int m) {
        int j, k;
        for (j = 0; j < m; j++) {
            int count = 0;
            for (k = 0; k < m; k++) {
                if (array[j] == array[k]) {
                    count++;
                }
            }

            //to print the distinct coupon numbers
            if (count == 1) {
                System.out.println(array[j] + " ");
                COUNTER_FOR_DISTINCTS++;
            }
        }
    }
}
