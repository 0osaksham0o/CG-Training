package Level;

import java.util.*;
public class Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        1. Write a program to take 2 numbers and print their quotient and remainder

        System.out.print("Enter first number: ");
        int numA = input.nextInt();

        System.out.print("Enter second number: ");
        int numB = input.nextInt();

        int quotient = numA / numB;
        int remainder = numA % numB;

        System.out.println(
                "The Quotient is " + quotient +
                        " and Reminder is " + remainder +
                        " of two number " + numA + " and " + numB
        );

//        2. IntOperation program using a, b, c

        System.out.print("Enter value of a: ");
        int aVal = input.nextInt();

        System.out.print("Enter value of b: ");
        int bVal = input.nextInt();

        System.out.print("Enter value of c: ");
        int cVal = input.nextInt();

        int result1 = aVal + bVal * cVal;
        int result2 = aVal * bVal + cVal;
        int result3 = cVal + aVal / bVal;
        int result4 = aVal % bVal + cVal;

        System.out.println(
                "The results of Int Operations are " +
                        result1 + ", " + result2 + ", " + result3 + ", and " + result4
        );

//        3. DoubleOpt program using double values

        System.out.print("Enter first double value: ");
        double d1 = input.nextDouble();

        System.out.print("Enter second double value: ");
        double d2 = input.nextDouble();

        System.out.print("Enter third double value: ");
        double d3 = input.nextDouble();

        double dResult1 = d1 + d2 * d3;
        double dResult2 = d1 * d2 + d3;
        double dResult3 = d3 + d1 / d2;
        double dResult4 = d1 % d2 + d3;

        System.out.println(
                "The results of Double Operations are " +
                        dResult1 + ", " + dResult2 + ", " + dResult3 + ", and " + dResult4
        );

//        4. Temperature conversion from Celsius to Fahrenheit

        System.out.print("Enter temperature in Celsius: ");
        double celsiusTemp = input.nextDouble();

        double fahrenheitResult = (celsiusTemp * 9 / 5) + 32;

        System.out.println(
                "The " + celsiusTemp + " celsius is " + fahrenheitResult + " fahrenheit"
        );

//        5. Temperature conversion from Fahrenheit to Celsius

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitTemp = input.nextDouble();

        double celsiusResult = (fahrenheitTemp - 32) * 5 / 9;

        System.out.println(
                "The " + fahrenheitTemp + " fahrenheit is " + celsiusResult + " celsius"
        );

//        6. Program to find total income using salary and bonus

        System.out.print("Enter salary: ");
        double salaryAmount = input.nextDouble();

        System.out.print("Enter bonus: ");
        double bonusAmount = input.nextDouble();

        double totalIncome = salaryAmount + bonusAmount;

        System.out.println(
                "The salary is INR " + salaryAmount +
                        " and bonus is INR " + bonusAmount +
                        ". Hence Total Income is INR " + totalIncome
        );

//        7. Program to swap two numbers

        System.out.print("Enter first number: ");
        int swapNum1 = input.nextInt();

        System.out.print("Enter second number: ");
        int swapNum2 = input.nextInt();

        int temp = swapNum1;
        swapNum1 = swapNum2;
        swapNum2 = temp;

        System.out.println(
                "The swapped numbers are " + swapNum1 + " and " + swapNum2
        );

//        8. Rewrite Sample Program 2 with user inputs

        System.out.print("Enter name: ");
        String name = input.next();

        System.out.print("Enter from city: ");
        String fromCity = input.next();

        System.out.print("Enter via city: ");
        String viaCity = input.next();

        System.out.print("Enter destination city: ");
        String toCity = input.next();

        System.out.print("Enter distance from source to via city (miles): ");
        double distance1 = input.nextDouble();

        System.out.print("Enter distance from via city to destination (miles): ");
        double distance2 = input.nextDouble();

        System.out.print("Enter time taken (hours): ");
        double travelTime = input.nextDouble();

        double totalDistance = distance1 + distance2;
        double speed = totalDistance / travelTime;

        System.out.println(
                name + " travelled from " + fromCity +
                        " to " + toCity +
                        " via " + viaCity +
                        ". Total Distance = " + totalDistance +
                        " miles and Speed = " + speed + " miles/hour"
        );

//        9. Athlete running in triangular park

        System.out.print("Enter side 1 of triangle (meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 of triangle (meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 of triangle (meters): ");
        double side3 = input.nextDouble();

        double perimeterMeters = side1 + side2 + side3;
        double totalDistanceMeters = 5000;

        double rounds = totalDistanceMeters / perimeterMeters;

        System.out.println(
                "The total number of rounds the athlete will run is " + rounds + " to complete 5 km"
        );

//        10. Divide chocolates among children

        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        int chocolatesEach = numberOfChocolates / numberOfChildren;
        int chocolatesRemaining = numberOfChocolates % numberOfChildren;

        System.out.println(
                "The number of chocolates each child gets is " + chocolatesEach +
                        " and the number of remaining chocolates are " + chocolatesRemaining
        );

//        11. Simple Interest calculation

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter time: ");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println(
                "The Simple Interest is " + simpleInterest +
                        " for Principal " + principal +
                        ", Rate of Interest " + rate +
                        " and Time " + time
        );

//        12. Convert weight from pounds to kilograms

        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();

        double weightKg = weightPounds / 2.2;

        System.out.println(
                "The weight of the person in pound is " + weightPounds +
                        " and in kg is " + weightKg
        );
    }
}
