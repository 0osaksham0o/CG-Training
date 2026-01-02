package Level;

import java.util.Scanner;
public class Level1 {

    public static void main(String[] args) {

//         1. Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024.

        int currentYear = 2024;
        int birthYear = 2000;
        int age = currentYear-birthYear;
        System.out.println("Harry's age in 2024 is " + age);

//         2. Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        int average = (maths+physics+chemistry)/3;
        System.out.println("Sam's average mark in PCM is " + average);

//        3.  Create a program to convert the distance of 10.8 kilometers to miles.
        float kiloMeters = 10.8f;
        double kmToMiles = 10.8*1.6;
        System.out.println("The distance "+ kiloMeters + " in miles is " + kmToMiles);

//        4. Create a program to calculate the profit and loss in number and percentage based on the cost
//        price of INR 129 and the selling price of INR 191.

        int costPrice = 129;
        int sellingPrice = 191;
        double profit = sellingPrice-costPrice;
        double profitPercent = (profit/sellingPrice)*100;

        System.out.println(
                "The Cost Price is INR " + costPrice +
                        " and Selling Price is INR " + sellingPrice +
                        ". The Profit is INR " + profit +
                        " and the Profit Percentage is " + profitPercent
        );

//        5.Suppose you have to divide 14 pens among 3 students equally.

        int numOfPens = 14;
        int numOfStudents = 3;
        int pensEach = 14/3;
        int pensLeft = numOfPens%numOfStudents;
        System.out.println("The Pen Per Student is " + pensEach + " and the remaining pen not distributed is "+ pensLeft);

//        6. University fee with discount

        int fee = 125000;
        int discountPercent = 10;
        double discountedAmount =  (125000 * 10) /100.0;
        double discountedPrice = fee-discountedAmount;
        System.out.println("The discount amount is INR " + discountedAmount + " and final discounted fee is INR " + discountedPrice);

//        7. Volume of Earth

        double radiusKm = 6378;
        double pi = Math.PI;

        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        double kmTo_Miles = 0.621371;
        double volumeMiles3 = volumeKm3 * Math.pow(kmTo_Miles, 3);

        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeKm3 +
                        " and cubic miles is " + volumeMiles3
        );

//        8.Create a program to convert distance in kilometers to miles

        double km;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        double miles = km / 1.6;

        System.out.println(
                "The total miles is " + miles + " mile for the given " + km + " km"
        );

//        9. Student Fee and University Discount (user input)

        System.out.print("Enter student fee: ");
        double fee2 = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent2 = input.nextDouble();

        double discount = (fee2 * discountPercent2) / 100;
        double finalFee = fee - discount;

        System.out.println("The fee you have to pay is " + finalFee);

//        10. Height conversion

        System.out.print("Enter height in centimeters: ");
        double heightCm = input.nextDouble();

        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println(
                "Your Height in cm is " + heightCm +
                        " while in feet is " + feet +
                        " and inches is " + inches
        );


//        11. Write a program to create a basic calculator

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println(
                "The addition, subtraction, multiplication and division value of 2 numbers "
                        + number1 + " and " + number2 + " is "
                        + addition + ", " + subtraction + ", " + multiplication + ", and " + division
        );

//        12. Write a program that takes base and height to find area of a triangle

        System.out.print("Enter base in inches: ");
        double baseInches = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = input.nextDouble();

        double areaSquareInches = 0.5 * baseInches * heightInches;
        double areaSquareCentimeters = areaSquareInches * 6.4516;

        System.out.println(
                "The area of triangle is " + areaSquareInches +
                        " square inches and " + areaSquareCentimeters + " square centimeters"
        );

//        13. Write a program to find the side of the square using perimeter

        System.out.print("Enter perimeter of the square: ");
        double squarePerimeter = input.nextDouble();

        double squareSide = squarePerimeter / 4;

        System.out.println(
                "The length of the side is " + squareSide +
                        " whose perimeter is " + squarePerimeter
        );

//        14. Write a program to find distance in yards and miles from feet

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println(
                "The distance in yards is " + distanceInYards +
                        " and in miles is " + distanceInMiles
        );

//        15. Write a program to calculate total price using unit price and quantity

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println(
                "The total purchase price is INR " + totalPrice +
                        " if the quantity " + quantity +
                        " and unit price is INR " + unitPrice
        );

//        16. Create a program to find maximum number of handshakes

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println(
                "The maximum number of possible handshakes is " + maxHandshakes
        );
    }
}
