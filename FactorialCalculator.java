import java.math.BigInteger;

public class FactorialCalculator {
    public static BigInteger calculateFactorial(int n) {
        if (n < 0) {
            return BigInteger.ZERO; // Factorial of a negative number is 0
        }
        
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static void main(String[] args) {
        int number = 100; // Change this to the desired number
        BigInteger result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is:\n" + result);
    }
}
