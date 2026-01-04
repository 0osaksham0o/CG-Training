package controlFlow;
import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Q1. Check whether a given year is a Leap Year (multiple if-else)
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println("The year is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("The year is not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("The year is a Leap Year");
        } else {
            System.out.println("The year is not a Leap Year");
        }


        // Q2. Check Leap Year using single if condition with logical operators
        System.out.print("\nEnter a year: ");
        int logicalYear = input.nextInt();

        if (logicalYear % 400 == 0 ||
                (logicalYear % 4 == 0 && logicalYear % 100 != 0)) {

            System.out.println("The year is a Leap Year");
        } else {
            System.out.println("The year is not a Leap Year");
        }


        // Q3. Calculate percentage, grade, and remarks
        System.out.print("\nEnter Physics marks: ");
        int physics = input.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = input.nextInt();

        int totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;

        System.out.println("Average Marks: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A | Remarks: Excellent");
        } else if (percentage >= 75) {
            System.out.println("Grade: B | Remarks: Very Good");
        } else if (percentage >= 60) {
            System.out.println("Grade: C | Remarks: Good");
        } else if (percentage >= 40) {
            System.out.println("Grade: D | Remarks: Pass");
        } else {
            System.out.println("Grade: F | Remarks: Fail");
        }

        // Q4. Check whether a number is Prime
        System.out.print("\nEnter a number to check Prime: ");
        int primeNumber = input.nextInt();

        boolean isPrime = true;

        if (primeNumber <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < primeNumber; i++) {
                if (primeNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The number is a Prime Number");
        } else {
            System.out.println("The number is not a Prime Number");
        }

        // Q5. Check whether a number is an Armstrong Number
        System.out.print("\nEnter a number to check Armstrong: ");
        int armstrongNumber = input.nextInt();

        int originalNumber = armstrongNumber;
        int sumOfCubes = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sumOfCubes += digit * digit * digit;
            originalNumber = originalNumber / 10;
        }

        if (sumOfCubes == armstrongNumber) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        // Q6. Count the number of digits in an integer
        System.out.print("\nEnter a number to count digits: ");
        int digitNumber = input.nextInt();

        int digitCount = 0;
        int tempNumber = digitNumber;

        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            digitCount++;
        }

        System.out.println("Number of digits: " + digitCount);

        // Q7. Calculate BMI of a person
        System.out.print("\nEnter weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);

        System.out.println("BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        // Q8. Check whether a number is a Harshad Number
        System.out.print("\nEnter a number to check Harshad: ");
        int harshadNumber = input.nextInt();

        int sumOfDigits = 0;
        int tempHarshad = harshadNumber;

        while (tempHarshad != 0) {
            sumOfDigits += tempHarshad % 10;
            tempHarshad = tempHarshad / 10;
        }

        if (harshadNumber % sumOfDigits == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        // Q9. Check whether a number is an Abundant Number
        System.out.print("\nEnter a number to check Abundant: ");
        int abundantNumber = input.nextInt();

        int divisorSum = 0;

        for (int i = 1; i < abundantNumber; i++) {
            if (abundantNumber % i == 0) {
                divisorSum += i;
            }
        }

        if (divisorSum > abundantNumber) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        // Q10. Calculator using switch-case
        System.out.print("\nEnter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                System.out.println("Result: " + (first / second));
                break;
            default:
                System.out.println("Invalid Operator");
        }

        // Q11. Find Day of Week using Gregorian calendar formula
        System.out.print("\nEnter month (1-12): ");
        int m = input.nextInt();

        System.out.print("Enter day: ");
        int d = input.nextInt();

        System.out.print("Enter year: ");
        int y = input.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int dayOfWeek = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day of week is: " + dayOfWeek);
    }

}
