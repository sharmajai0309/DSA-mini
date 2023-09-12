package DSA;

import java.util.Scanner;

public class Binary_to_decimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the decimal number you want to convert : ");
        int DN = sc.nextInt();
        int[] BA = new int[5];

        int index = 0;
        while (DN > 0) {
            int reminder = DN % 2;
            BA[index] = reminder;
            DN /= 2;
            index++;
        }
        // for printing the array values
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(BA[i]);
        }

    }
}
