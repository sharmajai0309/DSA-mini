package DSA;
// Given a number. Using bit manipulation, check whether it is odd or even.

public class odd_even_By_BIT {
    public static void main(String[] args) {
        {
            int number = 42; // Replace this with the number you want to check

            // Check if the least significant bit (LSB) is set to 1
            if ((number & 1) == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }

    }
}
