public class Numbers {

    public static int maximum(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int minimum(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int minSum(int[] numbers) {
        int maxNum = maximum(numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum-maxNum;
    }

    public static int maxSum(int[] numbers) {
        int minNum = minimum(numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum-minNum;
    }

}
