package com.varela;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNum, int secondNum) {
        if ((firstNum < 10 || firstNum > 99) || (secondNum < 10 || secondNum > 99)) {
            return false;
        }

        while (firstNum > 0 || secondNum > 0) {
            int firstNumberFirstDigit = firstNum % 10;
            int firstNumberSecondDigit = firstNum /= 10;

            int secondNumberFirstDigit = secondNum % 10;
            int secondNumberSecondDigit = secondNum /= 10;

            System.out.println(firstNumberFirstDigit);
            System.out.println(firstNumberSecondDigit);
            System.out.println(secondNumberFirstDigit);
            System.out.println(secondNumberSecondDigit);
            if ((firstNumberFirstDigit == secondNumberFirstDigit && firstNumberFirstDigit != 0 && secondNumberFirstDigit != 0) ||
                    (firstNumberFirstDigit == secondNumberSecondDigit && firstNumberFirstDigit != 0 && secondNumberSecondDigit != 0) ||
                    (firstNumberSecondDigit == secondNumberSecondDigit && firstNumberSecondDigit != 0 && secondNumberSecondDigit != 0)) {
                return true;
            }
        }
        return false;
    }
}

