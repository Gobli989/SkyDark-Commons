package vip.skydark.commons.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextUtils {

    public static List<String> format(List<String> s, Placeholder... placeholders) {
        List<String> a = new ArrayList<>();
        for (String value : s)
            for (Placeholder placeholder : placeholders)
                a.add(placeholder.format(value));
        return a;
    }

    public static String[] format(String[] s, Placeholder... placeholders) {
        return format(Arrays.asList(s), placeholders).toArray(new String[0]);
    }

    public static String format(String s, Placeholder... placeholders) {
        for (Placeholder placeholder : placeholders)
            s = placeholder.format(s);
        return s;
    }

}
