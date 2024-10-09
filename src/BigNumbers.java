public class BigNumbers {

    public static int[] add(int[] num1, int[] num2) {
        int[] result = new int[num1.length + num2.length];
        int over = 0;
        for (int i = num1.length - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + over;
            result[i + 1] = sum % 10;
            over = sum / 10;
        }

        result[0] = over;
        if (result[0] == 0)
            for (int i = 0; i < result.length; i++) {
                result[i] = result[i + 1];
            }
        return result;
    }


    public static int[] subtract(int[] num1, int[] num2) {
        int over = 0;
        int maxlen = 0, minlen = 0;
        int[] maxNum = new int[0], minNum = new int[0];
        if (num1.length > num2.length) {
            maxlen = num1.length;
            minlen = num2.length;
            maxNum = num1;
            minNum = num2;
        }
        if (num1.length < num2.length) {
            maxlen = num2.length;
            minlen = num1.length;
            maxNum = num2;
            minNum = num1;
        }
        if (num1.length == num2.length) {
            for (int i = 0; i < num1.length; i++) {
                if (num1[i] > num2[i]) {
                    maxlen = num1.length;
                    maxNum = num1;
                    minNum = num2;
                    break;
                }
                else if (num1[i] < num2[i]) {
                    maxlen = num1.length;
                    maxNum = num2;
                    minNum = num1;
                    break;
                }
            }
            if (maxlen == 0 && minlen == 0) {
                maxlen = num1.length;
                maxNum = num1;
                minNum = num2;
            }
        }

        int[] result = new int[maxlen];
        for (int i = maxlen - 1; i >= 0; i--) {
            int diff = maxNum[i] - minNum[i] - over;
            if (diff < 0) {
                diff += 10;
                over = 1;
            }
            else {
                over = 0;
            }
            result[i] = diff;
        }
        int index = 0;
        while (index < maxlen && result[index] == 0) {
            index++;
        }
        int newlen = maxlen - index;
        if (newlen == 0){
            return new int[]{0};
        }
        int[] newResult = new int[newlen];
        for (int i = 0; i < newlen; i++) {
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
        if (newlen == 0){
            return new int[]{0};
        }
        int[] newResult = new int[newlen];
        for (int i = 0; i < newlen; i++) {
            newResult[i] = result[index + i];
        }
        return newResult;
    }

}
