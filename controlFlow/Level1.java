package controlFlow;
import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Q1. Write a program to check if a number is divisible by 5
        System.out.print("Enter a number to check divisibility by 5: ");
        int number = input.nextInt();

        boolean isDivisibleByFive = number % 5 == 0;
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisibleByFive);

        // Q2. Write a program to check if the first number is the smallest of three numbers
        System.out.print("\nEnter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        boolean isFirstSmallest = number1 < number2 && number1 < number3;
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        // Q3. Write a program to check if the first, second, or third number is the largest
        System.out.println("Is the first number the largest? " + (number1 >= number2 && number1 >= number3));
        System.out.println("Is the second number the largest? " + (number2 >= number1 && number2 >= number3));
        System.out.println("Is the third number the largest? " + (number3 >= number1 && number3 >= number2));

        // Q4. Write a program to check for a natural number and find the sum of n natural numbers
        System.out.print("\nEnter a number to find sum of natural numbers: ");
        int naturalNumber = input.nextInt();

        if (naturalNumber > 0) {
            int naturalSum = naturalNumber * (naturalNumber + 1) / 2;
            System.out.println("The sum of " + naturalNumber + " natural numbers is " + naturalSum);
        } else {
            System.out.println("The number " + naturalNumber + " is not a natural number");
        }

        // Q5. Write a program to check whether a person can vote
        System.out.print("\nEnter age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Q6. Write a program to check whether a number is positive, negative, or zero
        System.out.print("\nEnter a number to check its type: ");
        int checkNumber = input.nextInt();

        if (checkNumber > 0) {
            System.out.println("Positive");
        } else if (checkNumber < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // Q7. Write a program to count down numbers using a while loop
        System.out.print("\nEnter countdown start number (while loop): ");
        int counterWhile = input.nextInt();

        while (counterWhile >= 1) {
            System.out.println(counterWhile);
            counterWhile--;
        }

        // Q8. Rewrite the countdown program using a for loop
        System.out.print("\nEnter countdown start number (for loop): ");
        int counterFor = input.nextInt();

        for (int i = counterFor; i >= 1; i--) {
            System.out.println(i);
        }

        // Q9. Write a program to find the sum of numbers until the user enters 0
        double totalSum = 0.0;
        double enteredValue;

        System.out.println("\nEnter numbers to sum (0 to stop): ");
        while (true) {
            enteredValue = input.nextDouble();

            if (enteredValue == 0) {
                break;
            }

            totalSum += enteredValue;
        }

        System.out.println("Total sum is " + totalSum);

        // Q10. Rewrite the program to stop when the user enters 0 or a negative number
        double breakSum = 0.0;

        System.out.println("\nEnter numbers to sum (0 or negative to stop): ");
        while (true) {
            enteredValue = input.nextDouble();

            if (enteredValue <= 0) {
                break;
            }

            breakSum += enteredValue;
        }

        System.out.println("Total sum is " + breakSum);

        // Q11. Find the sum of n natural numbers using while loop and compare with formula
        System.out.print("\nEnter a natural number for sum comparison (while loop): ");
        int compareNumberWhile = input.nextInt();

        if (compareNumberWhile > 0) {
            int sumLoop = 0;
            int i = 1;

            while (i <= compareNumberWhile) {
                sumLoop += i;
                i++;
            }

            int sumFormula = compareNumberWhile * (compareNumberWhile + 1) / 2;

            System.out.println("Sum using loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Both results are equal: " + (sumLoop == sumFormula));
        } else {
            System.out.println("Not a natural number");
        }

        // Q12. Rewrite the program using for loop to find the sum of n natural numbers
        System.out.print("\nEnter a natural number for sum comparison (for loop): ");
        int compareNumberFor = input.nextInt();

        if (compareNumberFor > 0) {
            int sumLoopFor = 0;

            for (int j = 1; j <= compareNumberFor; j++) {
                sumLoopFor += j;
            }

            int sumFormulaFor = compareNumberFor * (compareNumberFor + 1) / 2;

            System.out.println("Sum using loop: " + sumLoopFor);
            System.out.println("Sum using formula: " + sumFormulaFor);
            System.out.println("Both results are equal: " + (sumLoopFor == sumFormulaFor));
        } else {
            System.out.println("Not a natural number");
        }

        // Q13. Write a program to find the factorial using while loop
        System.out.print("\nEnter a positive integer to find factorial (while loop): ");
        int factorialNumberWhile = input.nextInt();

        if (factorialNumberWhile >= 0) {
            long factorialWhile = 1;
            int k = 1;

            while (k <= factorialNumberWhile) {
                factorialWhile *= k;
                k++;
            }

            System.out.println("Factorial of " + factorialNumberWhile + " is " + factorialWhile);
        } else {
            System.out.println("Invalid input");
        }

        // Q14. Rewrite the factorial program using for loop
        System.out.print("\nEnter a positive integer to find factorial (for loop): ");
        int factorialNumberFor = input.nextInt();

        if (factorialNumberFor >= 0) {
            long factorialFor = 1;

            for (int m = 1; m <= factorialNumberFor; m++) {
                factorialFor *= m;
            }

            System.out.println("Factorial of " + factorialNumberFor + " is " + factorialFor);
        } else {
            System.out.println("Invalid input");
        }

        // Q15. Write a program to print odd and even numbers up to a given number
        System.out.print("\nEnter a natural number to print odd and even: ");
        int oddEvenLimit = input.nextInt();

        if (oddEvenLimit > 0) {
            for (int n = 1; n <= oddEvenLimit; n++) {
                if (n % 2 == 0) {
                    System.out.println(n + " is Even");
                } else {
                    System.out.println(n + " is Odd");
                }
            }
        } else {
            System.out.println("Not a natural number");
        }

        // Q16. Write a program to find employee bonus based on years of service
        System.out.print("\nEnter employee salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        double bonus = 0.0;

        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus amount is " + bonus);

        // Q17. Write a program to print multiplication table from 6 to 9
        System.out.print("\nEnter a number to print multiplication table (6 to 9): ");
        int tableNumber = input.nextInt();

        for (int p = 6; p <= 9; p++) {
            System.out.println(tableNumber + " * " + p + " = " + (tableNumber * p));
        }


    }
}
