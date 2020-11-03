package com.varela;

public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int bigSum = bigCount * 5;
        int totalKilos = smallCount + bigSum;

        System.out.println("Small Sum = " + smallCount);
        System.out.println("Big Sum = " + bigSum);
        System.out.println("Goal = " + goal);
        System.out.println("Total Kilos = " + totalKilos);

        if (bigCount < 0 || smallCount < 0 || goal < 0 ) {
            return false;
        } else if (totalKilos == goal) {
            return true;
        } else if (totalKilos > goal && smallCount >= goal % 5) {
            return true;
        } else if (bigCount == 0 && smallCount >= goal) {
            return true;
        }

        return false;
    }
}
