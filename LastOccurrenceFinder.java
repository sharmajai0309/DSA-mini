package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class LastOccurrenceFinder {

    public static int last(int ar[], int target) {
        int lastindex = -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == target) {
                lastindex = i;
            }

        }
        return lastindex;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int ar[] = { 1, 2, 3, 4, 5, 5, 5, 6, 7, 8 };
        System.out.println("enter the target value");
        int result = last(ar, target);
        System.out.println("last occurence of digit is" + result);

    }

}
