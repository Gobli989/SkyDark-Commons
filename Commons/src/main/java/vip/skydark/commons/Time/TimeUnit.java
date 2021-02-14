package vip.skydark.commons.Time;

public enum TimeUnit {
    NANOSECOND(0.000000001),                 // 0.000 000 001 seconds
    MICROSECOND(0.000001),                   // 0.000 001 seconds
    MILLISECOND(0.001),                      // 0.001 seconds
    SECOND(1),                               // 1 second
    MINUTE(60),                              // 60 seconds
    HOUR(60 * MINUTE.seconds),               // 60 minutes
    DAY(24 * HOUR.seconds),                  // 24 hours
    WEEK(7 * DAY.seconds),                   // 7 days
    FORTNIGHT(2 * WEEK.seconds),             // 2 weeks
    MONTH(30 * DAY.seconds),                 //~30 days
    SEASON(3 * MONTH.seconds),               // 3 months
    SEMESTER(6 * MONTH.seconds),             // 6 months
    YEAR(12 * MONTH.seconds),                // 12 months
    BIENNIUM(2 * YEAR.seconds),              // 2 years
    TRIENNIUM(3 * YEAR.seconds),             // 3 years
    QUADRENNIUM(4 * YEAR.seconds),           // 4 years
    LUSTRUM(5 * YEAR.seconds),               // 5 years
    DECADE(10 * YEAR.seconds),               // 10 years
    INDICTION(15 * YEAR.seconds),            // 15 years
    JUBILEE(50 * YEAR.seconds),              // 50 years
    CENTURY(100 * YEAR.seconds),             // 100 years
    MILLENIUM(1000 * YEAR.seconds),          // 1000 years
    GALACTIC_YEAR(230000000 * YEAR.seconds); //~230 000 000 years

    private final double seconds;

    TimeUnit(double seconds) {
        this.seconds = seconds;
    }

    public double getSeconds() {
        return seconds;
    }

    public double convert(TimeUnit unit) {
        return seconds / unit.getSeconds();
    }

}
