// Commented by Connor Brown on 10/24/23

public class sum_even_fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1; // Set integer a to 0 and b to 1
        int sumEven = 0;
        while (b < 4000000) {
            if (b % 2 == 0) { // If b is even
                sumEven += b; // Add b to sumEven
            }
            // Add b's previous value to b
            int temp = b;
            b = a + b;
            a = temp;
        }
        // Print that weird number
        System.out.println(sumEven);
    }
}

// answer should be 4613732
