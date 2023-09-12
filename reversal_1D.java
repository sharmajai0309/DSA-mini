package DSA;

public class reversal_1D {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int n = array.length;

        for (int i = 0; i < n / 2; i++) {
            int data = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = data;

        }
        System.out.println("reversal of 1D array");
        System.out.print("{");
        for (int i = 0; i < n; i++) {

            System.out.print(array[i] + ",");
        }
        System.out.print("}");

    }
}
