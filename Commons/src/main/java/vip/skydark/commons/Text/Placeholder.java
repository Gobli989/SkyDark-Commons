package vip.skydark.commons.Text;

public class Placeholder {

    private final String r1;
    private final String r2;

    public Placeholder(String r1, String r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public Placeholder(String r1, int r2) {
        this.r1 = r1;
        this.r2 = "" + r2;
    }

    public Placeholder(String r1, double r2) {
        this.r1 = r1;
        this.r2 = "" + r2;
    }

    public String format(String string) {
        return string.replace(r1, r2);
    }



}
