package vip.skydark.commons.Math;

public class NumberUtils {

    public static boolean isBetween(double number, double min, double max) {
        return max >= number && number >= min;
    }

    public static boolean isBetween(int number, int min, int max) {
        return max >= number && number >= min;
    }

    public static boolean isNumber(String number) {
        if (number == null || number.isEmpty()) return false;
        try {
            double i = Double.parseDouble(number);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isInt(String number) {
        if (number == null || number.isEmpty()) return false;
        try {
            int i = Integer.parseInt(number);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public static int parseInt(String s) {
        if (isNumber(s)) return Integer.parseInt(s);
        return 0;
    }

}
