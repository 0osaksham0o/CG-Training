package Methods;
import java.util.Scanner;
public class Level1 {




        // 1. Simple Interest
        public static double calculateSimpleInterest(double principal, double rate, double time) {
            return (principal * rate * time) / 100;
        }

        // 2. Maximum Handshakes
        public static int calculateHandshakes(int numberOfStudents) {
            return (numberOfStudents * (numberOfStudents - 1)) / 2;
        }

        // 3. Triangular Park Rounds for 5 KM
        public static double calculateRounds(double side1, double side2, double side3) {
            double perimeter = side1 + side2 + side3;
            double totalDistance = 5000;
            return totalDistance / perimeter;
        }

        // 4. Positive, Negative or Zero
        public static int checkNumberType(int number) {
            if (number > 0) return 1;
            if (number < 0) return -1;
            return 0;
        }

        // 5. Spring Season Check
        public static boolean isSpringSeason(int month, int day) {
            return (month == 3 && day >= 20) ||
                    (month == 4) ||
                    (month == 5) ||
                    (month == 6 && day <= 20);
        }

        // 6. Sum of N Natural Numbers
        public static int sumOfNaturalNumbers(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }

        // 7. Smallest and Largest of 3 Numbers
        public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
            int smallest = Math.min(number1, Math.min(number2, number3));
            int largest = Math.max(number1, Math.max(number2, number3));
            return new int[]{smallest, largest};
        }

        // 8. Remainder and Quotient
        public static int[] findRemainderAndQuotient(int number, int divisor) {
            int quotient = number / divisor;
            int remainder = number % divisor;
            return new int[]{quotient, remainder};
        }

        // 9. Wind Chill Temperature
        public static double calculateWindChill(double temperature, double windSpeed) {
            return 35.74 + 0.6215 * temperature +
                    (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        }

        // 10. Trigonometric Functions
        public static double[] calculateTrigonometricFunctions(double angle) {
            double radians = Math.toRadians(angle);
            double sin = Math.sin(radians);
            double cos = Math.cos(radians);
            double tan = Math.tan(radians);
            return new double[]{sin, cos, tan};
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // Simple Interest
            double principal = input.nextDouble();
            double rate = input.nextDouble();
            double time = input.nextDouble();
            System.out.println("Simple Interest: " +
                    calculateSimpleInterest(principal, rate, time));

            // Handshakes
            int students = input.nextInt();
            System.out.println("Maximum Handshakes: " +
                    calculateHandshakes(students));

            // Triangular Park
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            System.out.println("Rounds Required: " +
                    calculateRounds(a, b, c));

            // Number Type
            int number = input.nextInt();
            System.out.println("Number Type Result: " +
                    checkNumberType(number));

            // Spring Season
            int month = input.nextInt();
            int day = input.nextInt();
            System.out.println(isSpringSeason(month, day)
                    ? "Its a Spring Season"
                    : "Not a Spring Season");

            // Sum of Natural Numbers
            int n = input.nextInt();
            System.out.println("Sum of Natural Numbers: " +
                    sumOfNaturalNumbers(n));

            // Smallest and Largest
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            int[] result = findSmallestAndLargest(x, y, z);
            System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);

            // Quotient and Remainder
            int num = input.nextInt();
            int div = input.nextInt();
            int[] qr = findRemainderAndQuotient(num, div);
            System.out.println("Quotient: " + qr[0] + ", Remainder: " + qr[1]);

            // Wind Chill
            double temp = input.nextDouble();
            double speed = input.nextDouble();
            System.out.println("Wind Chill: " +
                    calculateWindChill(temp, speed));

            // Trigonometric Functions
            double angle = input.nextDouble();
            double[] trig = calculateTrigonometricFunctions(angle);
            System.out.println("Sin: " + trig[0] +
                    ", Cos: " + trig[1] +
                    ", Tan: " + trig[2]);
        }


}
