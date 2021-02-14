package vip.skydark.commons.Arrays;

import vip.skydark.commons.Pairs.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArrayUtils {

    public static int max(int... i) {
        int max = 0;
        for (int i1 : i) if (i1 > max) max = i1;
        return max;
    }

    public static double max(double... i) {
        double max = 0;
        for (double i1 : i) if (i1 > max) max = i1;
        return max;
    }

    public static long max(long... i) {
        long max = 0;
        for (long i1 : i) if (i1 > max) max = i1;
        return max;
    }

    public static byte max(byte... i) {
        byte max = 0;
        for (byte i1 : i) if (i1 > max) max = i1;
        return max;
    }

    public static short max(short... i) {
        short max = 0;
        for (short i1 : i) if (i1 > max) max = i1;
        return max;
    }

    public static int maxIndex(int... i) {
        int max = i[0];
        int index = 0;
        for (int i1 = 0; i1 < i.length; i1++) {
            if (i[i1] > max) {
                index = i1;
                max = i[i1];
            }
        }
        return index;
    }

    public static int maxIndex(double... i) {
        double max = i[0];
        int index = 0;
        for (int i1 = 0; i1 < i.length; i1++) {
            if (i[i1] > max) {
                index = i1;
                max = i[i1];
            }
        }
        return index;
    }

    public static int maxIndex(long... i) {
        long max = i[0];
        int index = 0;
        for (int i1 = 0; i1 < i.length; i1++) {
            if (i[i1] > max) {
                index = i1;
                max = i[i1];
            }
        }
        return index;
    }

    public static int maxIndex(byte... i) {
        byte max = i[0];
        int index = 0;
        for (int i1 = 0; i1 < i.length; i1++) {
            if (i[i1] > max) {
                index = i1;
                max = i[i1];
            }
        }
        return index;
    }

    public static int maxIndex(short... i) {
        short max = i[0];
        int index = 0;
        for (int i1 = 0; i1 < i.length; i1++) {
            if (i[i1] > max) {
                index = i1;
                max = i[i1];
            }
        }
        return index;
    }

    public static int min(int... i) {
        int min = 0;
        for (int i1 : i) if (i1 < min) min = i1;
        return min;
    }

    public static double min(double... i) {
        double min = 0;
        for (double i1 : i) if (i1 < min) min = i1;
        return min;
    }

    public static long min(long... i) {
        long min = 0;
        for (long i1 : i) if (i1 < min) min = i1;
        return min;
    }

    public static byte min(byte... i) {
        byte min = 0;
        for (byte i1 : i) if (i1 < min) min = i1;
        return min;
    }

    public static short min(short... i) {
        short min = 0;
        for (short i1 : i) if (i1 < min) min = i1;
        return min;
    }

    public static int minIndex(int... i) {
        int min = i[0];
        int index = 0;
        for (int i1 = 0; i1 < i.length; i1++) {
            if (i[i1] < min) {
                index = i1;
                min = i[i1];
            }
        }
        return index;
    }

    public static double minIndex(double... i) {
        double min = i[0];
        int index = 0;
        for (int i1 = 0; i1 < i.length; i1++) {
            if (i[i1] < min) {
                index = i1;
                min = i[i1];
            }
        }
        return index;
    }

    public static int minIndex(long... i) {
        long min = i[0];
        int index = 0;
        for (int i1 = 0; i1 < i.length; i1++) {
            if (i[i1] < min) {
                index = i1;
                min = i[i1];
            }
        }
        return index;
    }

    public static int minIndex(byte... i) {
        byte min = i[0];
        int index = 0;
        for (int i1 = 0; i1 < i.length; i1++) {
            if (i[i1] < min) {
                index = i1;
                min = i[i1];
            }
        }
        return index;
    }

    public static int minindex(short... i) {
        short min = i[0];
        int index = 0;
        for (int i1 = 0; i1 < i.length; i1++) {
            if (i[i1] < min) {
                index = i1;
                min = i[i1];
            }
        }
        return index;
    }

    public static <T> List<T> toList(T[] array) {
        return Arrays.asList(array);
    }

    public static <T> List<T> toList(Set<T> set) {
        return new ArrayList<>(set);
    }

    public static <T, U> boolean foundPair(List<Pair<T, U>> list, T toFind) {
        for (Pair<T, U> pair : list) if (pair.getLeft().equals(toFind)) return true;
        return false;
    }

    public static <T> boolean contains(T[] array, T toFind) {
        for (T o : array)
            if (o == toFind) return true;
        return false;
    }

    public static <T> boolean add(T[] array, T toAdd) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = toAdd;
                return true;
            }
        }
        return false;
    }

    public static <T> boolean remove(T[] array, T toRemove) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toRemove) {
                array[i] = null;
                return true;
            }
        }
        return false;
    }

    public static <T> boolean removeAll(T[] array, T toRemove) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toRemove) {
                array[i] = null;
            }
        }
        return false;
    }

    public static <T> int count(T[] array, T toCount) {
        int c = 0;
        for (T t : array)
            if (t == toCount)
                c++;
        return c;
    }

    public static <T> int count(T[] array) {
        int c = 0;
        for (int i = 0; i < array.length; i++)
            c++;
        return c;
    }

    public static boolean equals(String main, String... args) {
        for (String s : args) if (main.equals(s)) return true;
        return false;
    }

    public static boolean equalsIgnoreCase(String main, String... args) {
        for (String s : args) if (main.equalsIgnoreCase(s)) return true;
        return false;
    }

}
