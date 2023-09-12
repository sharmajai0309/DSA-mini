package DSA;

import java.util.Scanner;

public class predict_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check power");
        int result = sc.nextInt();
        boolean ispoweroftwo = result > 0 && (result & (result - 1)) == 0;

        if (ispoweroftwo) {
            System.out.println(result + " is a power of two.");
        } else {
            System.out.println(result + " is not a power of two.");
        }

    }
}
