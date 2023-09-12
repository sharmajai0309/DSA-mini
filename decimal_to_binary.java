package DSA;

import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");

        int decimalNumber = sc.nextInt();
        String binaryString = Integer.toBinaryString(decimalNumber);

        System.out.println("Binary equivalent: " + binaryString);
    }
}
