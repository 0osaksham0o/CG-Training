package Methods;
import java.util.Scanner;

public class Level2 {

    // 1️⃣ Find all factors of a number
    public static int[] findFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int value : factors) {
            sum += value;
        }
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int value : factors) {
            product *= value;
        }
        return product;
    }

    public static double sumOfSquaresOfFactors(int[] factors) {
        double sum = 0;
        for (int value : factors) {
            sum += Math.pow(value, 2);
        }
        return sum;
    }

    // 2️⃣ Sum of N natural numbers
    public static int sumOfNaturalNumbersRecursive(int number) {
        if (number == 0) {
            return 0;
        }
        return number + sumOfNaturalNumbersRecursive(number - 1);
    }

    public static int sumOfNaturalNumbersFormula(int number) {
        return number * (number + 1) / 2;
    }

    // 3️⃣ Leap Year Check
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    // 4️⃣ Unit Conversions (used ones only)
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Program 1: Factors
        int number = input.nextInt();
        int[] factors = findFactors(number);

        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Sum of Squares of Factors: " + sumOfSquaresOfFactors(factors));

        // Program 2: Sum of Natural Numbers
        int n = input.nextInt();
        System.out.println("Recursive Sum: " + sumOfNaturalNumbersRecursive(n));
        System.out.println("Formula Sum: " + sumOfNaturalNumbersFormula(n));

        // Program 3: Leap Year
        int year = input.nextInt();
        System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");

        // Program 4–6: Unit Conversions
        double value = input.nextDouble();
        System.out.println(convertKmToMiles(value));
        System.out.println(convertMetersToFeet(value));
        System.out.println(convertFahrenheitToCelsius(value));
    }
}
