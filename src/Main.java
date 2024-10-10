import java.util.Arrays;

public class Main {

    public static void gradesTest() {
        int[] grades = {25, 48, 38, 84, 50, 11, 64};
        System.out.println("Failing grades: " + Arrays.toString(Grades.failingGrades(grades)));
        System.out.println("Average: " + Grades.average(grades));
        System.out.println("Biggest rounded grade: " + Grades.maxRounded(grades));
    }

    public static void numbersTest() {
        int[] numbers = {5, 34, 22, 85, 21, 44};
        System.out.println("Minimum: " + Numbers.minimum(numbers));
        System.out.println("Maximum: " + Numbers.maximum(numbers));
        System.out.println("Maximum sum of n-1 numbers: " + Numbers.maxSum(numbers));
        System.out.println("Minimum sum of n-1 numbers: " + Numbers.minSum(numbers));
    }

    public static void bigNumbersTest() {
        int[] num1 = {2, 9, 4, 5, 6, 2, 4, 0, 1};
        int[] num2 = {5, 9, 4, 5, 6, 2, 4};
        int digit = 5;
        System.out.println("Addition: " + Arrays.toString(BigNumbers.add(num1, num2)));
        System.out.println("Subtraction: " + Arrays.toString(BigNumbers.subtract(num1, num2)));
        System.out.println("Multiplication: " + Arrays.toString(BigNumbers.multiply(num1, digit)));
        System.out.println("Division: " + Arrays.toString(BigNumbers.divide(num2, digit)));
    }

    public static void electronicsTest() {
        int[] keyboards = {35, 25, 15, 70, 55, 30};
        int[] usbs = {10, 45, 30, 55, 20};
        int budget = 50;
        System.out.println("Cheapest keyboard: " + Electronics.cheapestKeyboard(keyboards));
        System.out.println("Cheapest object: " + Electronics.cheapestObject(keyboards, usbs));
        System.out.println("USB within budget: " + Electronics.budgetUSB(usbs, budget));
        System.out.println("Markus will spend this sum on both objects: " + Electronics.maxBudget(keyboards, usbs, budget));

    }

    public static void main(String[] args) {
        System.out.println("Aufgabe 1:");
        gradesTest();
        System.out.println(" ");
        System.out.println("Aufgabe 2:");
        numbersTest();
        System.out.println(" ");
        System.out.println("Aufgabe 3:");
        bigNumbersTest();
        System.out.println(" ");
        System.out.println("Aufgabe 4:");
        electronicsTest();

    }

}

