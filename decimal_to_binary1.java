package DSA;

import java.util.Scanner;

public class decimal_to_binary1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal want to convert: ");
        int number = sc.nextInt();
        String BS = Integer.toBinaryString(number);
        System.out.println("the binary numer of the given string is: " + BS);

    }

}
