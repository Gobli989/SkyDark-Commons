package vip.skydark.commons.Time;

public class TimeUtils {

    // TODO: Make this working

    private int seconds;
    private String format;

    public TimeUtils(int seconds) {
        this.seconds = seconds;
    }

    public String format(String format) {
        double s = seconds;
        String f = format;

//        if(f.contains("{ns}"))

        return format
                .replace("{ns}", convertToString(TimeUnit.NANOSECOND))
                .replace("{mc}", convertToString(TimeUnit.MICROSECOND))
                .replace("{ms}", convertToString(TimeUnit.MILLISECOND))
                .replace("{s}", convertToString(TimeUnit.SECOND))
                .replace("{m}", convertToString(TimeUnit.MINUTE))
                .replace("{h}", convertToString(TimeUnit.HOUR))
                .replace("{d}", convertToString(TimeUnit.DAY))
                .replace("{w}", convertToString(TimeUnit.WEEK))
                .replace("{fn}", convertToString(TimeUnit.FORTNIGHT))
                .replace("{mo}", convertToString(TimeUnit.MONTH))
                .replace("{sa}", convertToString(TimeUnit.SEASON))
                .replace("{se}", convertToString(TimeUnit.SEMESTER))
                .replace("{y}", convertToString(TimeUnit.YEAR))
                .replace("{bn}", convertToString(TimeUnit.BIENNIUM))
                .replace("{tn}", convertToString(TimeUnit.TRIENNIUM))
                .replace("{qn}", convertToString(TimeUnit.QUADRENNIUM))
                .replace("{l}", convertToString(TimeUnit.LUSTRUM))
                .replace("{de}", convertToString(TimeUnit.DECADE))
                .replace("{i}", convertToString(TimeUnit.INDICTION))
                .replace("{j}", convertToString(TimeUnit.JUBILEE))
                .replace("{c}", convertToString(TimeUnit.CENTURY))
                .replace("{mi}", convertToString(TimeUnit.MILLENIUM))
                .replace("{gy}", convertToString(TimeUnit.GALACTIC_YEAR));
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String convertToString(TimeUnit unit) {
        return "" + TimeUnit.SECOND.convert(unit);
    }

    //    public static String formatTime(int seconds) {
//        return formatTime(seconds, autoFormat(seconds));
//    }
//
//    public static String formatTime(int seconds, String timeFormat) {
//        DateTimeFormatter format = DateTimeFormatter.ofPattern(timeFormat);
//        return format.format(LocalTime.ofSecondOfDay(seconds));
//    }
//
//    public static String autoFormat(int seconds) {
//        return autoFormat((long) seconds);
//    }
//
//    public static String autoFormat(long seconds) {
//        int day = (int) TimeUnit.SECONDS.toDays(seconds);
//        int hours = (int) (TimeUnit.SECONDS.toHours(seconds) - (day * 24));
//        int minute = (int) (TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds) * 60));
//        int second = (int) (TimeUnit.SECONDS.toSeconds(seconds) - (TimeUnit.SECONDS.toMinutes(seconds) * 60));
//
//        String format;
//        if (seconds / 86400d >= 1)
//            format = "{d} nap, {H} óra, {m} perc, {s} mp";
//        else if (seconds / 3600d >= 1)
//            format = "{H} óra, {m} perc, {s} mp";
//        else if (seconds / 60d >= 1)
//            format = "{m} per, {s} mp";
//        else format = "{s} mp";
//
//        return format.replace("{d}", "" + day)
//                .replace("{H}", "" + hours)
//                .replace("{m}", "" + minute)
//                .replace("{s}", "" + second);
//    }

}
