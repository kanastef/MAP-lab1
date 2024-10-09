public class Electronics {

    public static int cheapestKeyboard(int[] keyboardPrices) {
        int cheapest = keyboardPrices[0];
        for (int i = 0; i < keyboardPrices.length; i++) {
            if (keyboardPrices[i] < cheapest) {
                cheapest = keyboardPrices[i];
            }
        }
        return cheapest;
    }

    public static int cheapestObject(int[] keyboardPrices, int[] usbPrices) {
        int cheapest = keyboardPrices[0];
        for (int i = 0; i < usbPrices.length; i++) {
            if (usbPrices[i] < cheapest) {
                cheapest = usbPrices[i];
            }
        }
        if (cheapestKeyboard(keyboardPrices) < cheapest) {
            cheapest = cheapestKeyboard(keyboardPrices);
        }
        return cheapest;
    }

    public static int budgetUSB(int[] usbPrices, int budget) {
        int expensive = -1;
        for (int i = 0; i < usbPrices.length; i++) {
            if (usbPrices[i] > expensive && usbPrices[i] < budget) {
                expensive = usbPrices[i];
            }
        }
        return expensive;
    }

    public static int maxBudget(int[] keyboardPrices, int[] usbPrices, int budget) {
        int maxBudget = -1;
        for (int i = 0; i < keyboardPrices.length; i++) {
            for (int j = 0; j < usbPrices.length; j++) {
                int price = keyboardPrices[i] + usbPrices[j];
                if (price <= budget) {
                    maxBudget = Math.max(maxBudget, price);
                }
            }
        }
        return maxBudget;
    }

}
