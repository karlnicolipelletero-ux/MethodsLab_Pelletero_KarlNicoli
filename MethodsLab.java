package trigonometrylab7;

import java.util.Scanner;

public class MethodsLab {

    // task 1: greetings method
    public static void greetUser() {
        System.out.println("Hello, welcome to the Math Program!");
    }

    // task 2: basic arithmetic calculator methods
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    // task 3: factorial method
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // task 4: array summation method
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // task 5: prime number checker method
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // task 1: call greeting method
        greetUser();

        // task 2: arithmetic operations input and output
        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        // casting to double for division to match the method signature
        System.out.println("Division: " + divide((double) num1, (double) num2));

        // task 3: factorial input and output
        System.out.print("Enter a number for factorial: ");
        int factInput = scanner.nextInt();
        System.out.println("Factorial: " + factorial(factInput));

        // task 4: array summation output
        // initializing array with 5 numbers as requested
        int[] myNumbers = {10, 20, 30, 5, 10};
        System.out.println("Sum of array elements: " + sumArray(myNumbers));

        // task 5: prime checker input and output
        System.out.print("Enter a number to check prime: ");
        int primeInput = scanner.nextInt();
        boolean isPrimeResult = isPrime(primeInput);

        if (isPrimeResult) {
            System.out.println(primeInput + " is prime.");
        } else {
            System.out.println(primeInput + " is not prime.");
        }

        scanner.close();
    }
}
