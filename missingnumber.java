package DSA;

public class missingnumber {

    public static void main(String[] args) {
        long[] arr = { 1, 2, 3, 5, 6, 7, };
        long n = arr.length;
        long sum = 0;
        long missing_element = 0;

        // Sum of all natural numbers in array
        long sum_of_natural_number = ((n + 1) * (n + 2)) / 2;

        // Sum of all number present in an array
        for (long i = 0; i < n; i++) {
            sum += arr[(int) i];
        }
        missing_element = sum_of_natural_number - sum;
        System.out.println("missing element: " + missing_element);
    }

}
