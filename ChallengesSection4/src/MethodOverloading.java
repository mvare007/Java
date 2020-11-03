public class MethodOverloading {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double inchesToCentimeters = inches * 2.54;
            double feetToCentimeters = feet * 30.48;
            return inchesToCentimeters + feetToCentimeters;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            return inches * 2.54;
        } else {
            return -1;
        }
    }
}
