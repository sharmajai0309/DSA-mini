package DSA;

public class Palindrome {
    public static void main(String[] args) {
        int ar[] = { 2, 3, 4, 5, 4, 3, 2 };
        int n = ar.length;
        int flag = 0;

        for (int i = 0; i < n / 2; i++) {
            if (ar[i] != ar[n - i - 1]) {
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("is palindrome");
        } else
            System.out.println("IS not a palindrome");

    }
}