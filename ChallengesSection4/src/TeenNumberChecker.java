public class TeenNumberChecker {
    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        int min = 13;
        int max = 19;
        if ((firstNumber >= min && firstNumber <= max) || (secondNumber >= min && secondNumber <= max) || (thirdNumber >= min && thirdNumber <= max)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int number) {
        int min = 13;
        int max = 19;
        if (number >= min && number <= max) {
            return true;
        } else {
            return false;
        }
    }
}
