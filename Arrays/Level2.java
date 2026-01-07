package Arrays;
import java.util.Scanner;

public class Level2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        zaraEmployeeBonus(input);
        youngestAndTallest(input);
        largestSecondLargestFixed(input);
        largestSecondLargestDynamic(input);
        reverseNumber(input);
        bmiUsingArrays(input);
        bmiUsing2DArray(input);
        studentMarks1D(input);
        studentMarks2D(input);
        digitFrequency(input);
    }


//    Q1.Zara Employee Bonus Calculation

    static void zaraEmployeeBonus(Scanner input) {

        int employeeCount = 10;

        double[] salary = new double[employeeCount];
        double[] service = new double[employeeCount];
        double[] bonus = new double[employeeCount];
        double[] newSalary = new double[employeeCount];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < employeeCount; i++) {

            System.out.print("Salary of Employee " + (i + 1) + ": ");
            salary[i] = input.nextDouble();

            System.out.print("Years of Service: ");
            service[i] = input.nextDouble();

            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
            }
        }

        for (int i = 0; i < employeeCount; i++) {

            bonus[i] = (service[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }


//   Q2. Youngest and Tallest Friend

    static void youngestAndTallest(Scanner input) {

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[names.length];
        double[] height = new double[names.length];

        for (int i = 0; i < names.length; i++) {

            System.out.print("Age of " + names[i] + ": ");
            age[i] = input.nextInt();

            System.out.print("Height of " + names[i] + ": ");
            height[i] = input.nextDouble();

            if (age[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
            }
        }

        int youngest = 0;
        int tallest = 0;

        for (int i = 1; i < names.length; i++) {

            if (age[i] < age[youngest]) {
                youngest = i;
            }
            if (height[i] > height[tallest]) {
                tallest = i;
            }
        }

        System.out.println("Youngest: " + names[youngest]);
        System.out.println("Tallest: " + names[tallest]);
    }


//    Q3.   Largest & Second Largest Digit (Fixed Array)

    static void largestSecondLargestFixed(Scanner input) {

        System.out.print("Enter number: ");
        int number = input.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0 && index < maxDigit) {
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }



//    Q4. Largest & Second Largest Digit (Dynamic Array)

    static void largestSecondLargestDynamic(Scanner input) {

        System.out.print("Enter number: ");
        int number = input.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {

            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }


//   Q5. Reverse Number Using Array

    static void reverseNumber(Scanner input) {

        System.out.print("Enter number: ");
        int number = input.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        System.out.print("Reversed Number: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }


//  Q6.  BMI using 1D Arrays

    static void bmiUsingArrays(Scanner input) {

        System.out.print("Number of persons: ");
        int n = input.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Weight: ");
            weight[i] = input.nextDouble();

            System.out.print("Height (m): ");
            height[i] = input.nextDouble();

            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }

            bmi[i] = weight[i] / (height[i] * height[i]);
            status[i] = (bmi[i] < 18.5) ? "Underweight"
                    : (bmi[i] < 25) ? "Normal"
                    : (bmi[i] < 30) ? "Overweight"
                    : "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(weight[i] + " " + height[i] + " " + bmi[i] + " " + status[i]);
        }
    }


//    Q7. BMI using 2D Array

    static void bmiUsing2DArray(Scanner input) {

        System.out.print("Number of persons: ");
        int n = input.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Weight: ");
            personData[i][0] = input.nextDouble();

            System.out.print("Height (m): ");
            personData[i][1] = input.nextDouble();

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }

            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            status[i] = personData[i][2] < 18.5 ? "Underweight"
                    : personData[i][2] < 25 ? "Normal"
                    : personData[i][2] < 30 ? "Overweight"
                    : "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][0] + " " +
                    personData[i][1] + " " +
                    personData[i][2] + " " +
                    status[i]);
        }
    }


//  Q8.  Student Marks using 1D Arrays

    static void studentMarks1D(Scanner input) {

        System.out.print("Number of students: ");
        int n = input.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {

            physics[i] = input.nextInt();
            chemistry[i] = input.nextInt();
            maths[i] = input.nextInt();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks. Enter again.");
                i--;
                continue;
            }

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            grade[i] = percentage[i] >= 75 ? "A"
                    : percentage[i] >= 60 ? "B"
                    : percentage[i] >= 40 ? "C"
                    : "Fail";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(percentage[i] + " " + grade[i]);
        }
    }


//   Q9. Student Marks using 2D Array

    static void studentMarks2D(Scanner input) {

        System.out.print("Number of students: ");
        int n = input.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = input.nextInt();
                if (marks[i][j] < 0) {
                    System.out.println("Invalid marks. Enter again.");
                    j--;
                }
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            grade[i] = percentage[i] >= 75 ? "A"
                    : percentage[i] >= 60 ? "B"
                    : percentage[i] >= 40 ? "C"
                    : "Fail";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(percentage[i] + " " + grade[i]);
        }
    }


//    Q10. Digit Frequency

    static void digitFrequency(Scanner input) {

        System.out.print("Enter number: ");
        int number = input.nextInt();

        int[] frequency = new int[10];

        while (number != 0) {
            frequency[number % 10]++;
            number /= 10;
        }

        for (int i = 0; i < frequency.length; i++) {
            System.out.println(i + " -> " + frequency[i]);
        }
    }
}
