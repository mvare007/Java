public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        double first = firstNumber * 1000;
        double second = secondNumber * 1000;
        if ( (int) first == (int) second ) {
            return true;
        } else {
            return false;
        }
    }
}
