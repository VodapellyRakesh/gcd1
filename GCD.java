public class GCD {

    public static void main(String[] args) {
        // Hardcoded numbers
        int num1 = 56;
        int num2 = 98;

        // Calculate GCD
        int gcd = findGCD(num1, num2);

        // Display the result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    // Function to find the GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        // Loop until b becomes zero
        while (b != 0) {
            int temp = b;
            b = a % b;  // Get the remainder
            a = temp;   // Assign the remainder to a
        }
        return a;  // When b is 0, a contains the GCD
    }
}

