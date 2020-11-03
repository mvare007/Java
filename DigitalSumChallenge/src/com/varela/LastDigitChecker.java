package com.varela;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if ((isValid(firstNumber)) && (isValid(secondNumber)) && (isValid(thirdNumber))) {
            int firstDigit = firstNumber % 10;
            int secondDigit = secondNumber % 10;
            int thirdDigit = thirdNumber % 10;

            if ((firstDigit == secondDigit) || (firstDigit == thirdDigit) || (secondDigit == thirdDigit)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        } else {
            return true;
        }
    }
}
