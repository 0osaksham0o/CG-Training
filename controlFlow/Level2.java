package controlFlow;
import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Q1. Print odd and even numbers between 1 to the number entered by the user
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            System.out.println("The number is not a natural number");
        }

        // Q2. Find employee bonus based on years of service
        System.out.print("\nEnter employee salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        double bonus = 0.0;

        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus amount is " + bonus);

        // Q3. Print multiplication table from 6 to 9
        System.out.print("\nEnter a number to print multiplication table (6 to 9): ");
        int tableNumber = input.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(tableNumber + " * " + i + " = " + (tableNumber * i));
        }

        // Q4. FizzBuzz using for loop
        System.out.print("\nEnter a positive integer for FizzBuzz (for loop): ");
        int fizzBuzzNumberFor = input.nextInt();

        if (fizzBuzzNumberFor > 0) {
            for (int i = 1; i <= fizzBuzzNumberFor; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid input");
        }

        // Q5. FizzBuzz using while loop
        System.out.print("\nEnter a positive integer for FizzBuzz (while loop): ");
        int fizzBuzzNumberWhile = input.nextInt();

        if (fizzBuzzNumberWhile > 0) {
            int counter = 1;

            while (counter <= fizzBuzzNumberWhile) {
                if (counter % 3 == 0 && counter % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (counter % 3 == 0) {
                    System.out.println("Fizz");
                } else if (counter % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("Invalid input");
        }

        // Q6. Find youngest and tallest among Amar, Akbar, and Anthony
        System.out.print("\nEnter Amar's age: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        System.out.print("Enter Amar's height: ");
        double amarHeight = input.nextDouble();

        System.out.print("Enter Akbar's height: ");
        double akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = input.nextDouble();

        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Amar is the youngest");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }

        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Amar is the tallest");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }

        // Q7. Find factors of a number using for loop
        System.out.print("\nEnter a positive integer to find factors (for loop): ");
        int factorNumberFor = input.nextInt();

        if (factorNumberFor > 0) {
            for (int i = 1; i < factorNumberFor; i++) {
                if (factorNumberFor % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid input");
        }

        // Q8. Find factors of a number using while loop
        System.out.print("\nEnter a positive integer to find factors (while loop): ");
        int factorNumberWhile = input.nextInt();

        if (factorNumberWhile > 0) {
            int i = 1;
            while (i < factorNumberWhile) {
                if (factorNumberWhile % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Invalid input");
        }

        // Q9. Find the greatest factor of a number excluding itself (for loop)
        System.out.print("\nEnter a number to find greatest factor (for loop): ");
        int greatestFactorNumberFor = input.nextInt();

        int greatestFactorFor = 1;

        for (int i = greatestFactorNumberFor - 1; i >= 1; i--) {
            if (greatestFactorNumberFor % i == 0) {
                greatestFactorFor = i;
                break;
            }
        }

        System.out.println("Greatest factor is " + greatestFactorFor);

        // Q10. Find the greatest factor of a number excluding itself (while loop)
        System.out.print("\nEnter a number to find greatest factor (while loop): ");
        int greatestFactorNumberWhile = input.nextInt();

        int greatestFactorWhile = 1;
        int counterWhile = greatestFactorNumberWhile - 1;

        while (counterWhile >= 1) {
            if (greatestFactorNumberWhile % counterWhile == 0) {
                greatestFactorWhile = counterWhile;
                break;
            }
            counterWhile--;
        }

        System.out.println("Greatest factor is " + greatestFactorWhile);

        // Q11. Find all multiples of a number below 100 using for loop
        System.out.print("\nEnter a number less than 100: ");
        int multipleNumberFor = input.nextInt();

        if (multipleNumberFor > 0 && multipleNumberFor < 100) {
            for (int i = 100; i >= 1; i--) {
                if (i % multipleNumberFor == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid input");
        }

        // Q12. Find the power of a number using for loop
        System.out.print("\nEnter a number: ");
        int baseFor = input.nextInt();

        System.out.print("Enter power: ");
        int powerFor = input.nextInt();

        int resultFor = 1;

        for (int i = 1; i <= powerFor; i++) {
            resultFor *= baseFor;
        }

        System.out.println("Result is " + resultFor);

        // Q13. Find all multiples of a number below 100 using while loop
        System.out.print("\nEnter a number less than 100: ");
        int multipleNumberWhile = input.nextInt();

        if (multipleNumberWhile > 0 && multipleNumberWhile < 100) {
            int i = 100;
            while (i >= 1) {
                if (i % multipleNumberWhile == 0) {
                    System.out.println(i);
                }
                i--;
            }
        } else {
            System.out.println("Invalid input");
        }

        // Q14. Find the power of a number using while loop
        System.out.print("\nEnter a number: ");
        int baseWhile = input.nextInt();

        System.out.print("Enter power: ");
        int powerWhile = input.nextInt();

        int resultWhile = 1;
        int counter = 0;

        while (counter < powerWhile) {
            resultWhile *= baseWhile;
            counter++;
        }

        System.out.println("Result is " + resultWhile);
    }
}
