public class BigNumbers {

    public static int[] add(int[] num1, int[] num2) {
        int maxLength = Math.max(num1.length, num2.length);
        int[] result = new int[maxLength + 1];
        int over = 0;
        for (int i = 0; i < maxLength; i++) {
            int digit1 = (num1.length - 1 - i >= 0) ? num1[num1.length - 1 - i] : 0;
            int digit2 = (num2.length - 1 - i >= 0) ? num2[num2.length - 1 - i] : 0;
            int sum = digit1 + digit2 + over;
            result[i + 1] = sum % 10;
            over = sum / 10;
        }
        result[0] = over;
        if (result[0] == 0) {
            int[] newResult = new int[maxLength];
            for (int i = 0; i < maxLength; i++) {
                newResult[i] = result[i + 1];
            }
            return newResult;
        }
        return result;
    }

    private static boolean compareNums(int[] num1, int[] num2) {
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] > num2[i])
                return true;
            if (num1[i] < num2[i])
                return false;
        }
        return true;
    }

    public static int[] subtract(int[] num1, int[] num2) {
        int maxLength = Math.max(num1.length, num2.length);
        int[] maxNum = num1;
        int[] minNum = num2;
        if (num1.length < num2.length || (num1.length == num2.length && !compareNums(num1, num2))) {
            maxNum = num2;
            minNum = num1;
        }
        int[] result = new int[maxLength];
        int over = 0;
        for (int i = 0; i < maxLength; i++) {
            int digit1 = (maxNum.length - 1 - i >= 0) ? maxNum[maxNum.length - 1 - i] : 0;
            int digit2 = (minNum.length - 1 - i >= 0) ? minNum[minNum.length - 1 - i] : 0;
            int diff = digit1 - digit2 - over;
            if (diff < 0) {
                diff += 10;
                over = 1;
            }
            else {
                over = 0;
            }
            result[maxLength - 1 - i] = diff;
        }
        int index = 0;
        while (index < maxLength && result[index] == 0) {
            index++;
        }
        int newLength = maxLength - index;
        if (newLength == 0)
            return new int[]{0};
        int[] newResult = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newResult[i] = result[index + i];
        }
        return newResult;
    }

    public static int[] multiply(int[] num1, int digit) {
        int[] result = new int[num1.length + 1];
        int over = 0;
        for (int i = num1.length - 1; i >= 0; i--) {
            int multiplication = num1[i] * digit + over;
            result[i + 1] = multiplication % 10;
            over = multiplication / 10;
        }
        result[0] = over;
        if (result[0] == 0) {
            int[] newResult = new int[num1.length];
            for (int i = 0; i < result.length; i++) {
                newResult[i] = result[i + 1];
            }
            return newResult;
        }
        return result;
    }

    public static int[] divide(int[] num1, int digit) {
        int[] result = new int[num1.length];
        int over = 0;
        for (int i = 0; i < num1.length; i++) {
            int num = over * 10 + num1[i];
            result[i] = num / digit;
            over = num % digit;
        }
        int index = 0;
        while (index < num1.length && result[index] == 0) {
            index++;
        }
        int newlen = num1.length - index;
        int[] newResult = new int[newlen];
        for (int i = 0; i < newlen; i++) {
            newResult[i] = result[index + i];
        }
        return newResult;
    }

}
