package vip.skydark.commons.Pairs;

public class Quadruple<ONE, TWO, THR, FOU> {

    private ONE first;
    private TWO second;
    private THR third;
    private FOU fourth;

    public Quadruple(ONE first, TWO second, THR third, FOU fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public ONE getFirst() {
        return first;
    }

    public void setFirst(ONE first) {
        this.first = first;
    }

    public TWO getSecond() {
        return second;
    }

    public void setSecond(TWO second) {
        this.second = second;
    }

    public THR getThird() {
        return third;
    }

    public void setThird(THR third) {
        this.third = third;
    }

    public FOU getFourth() {
        return fourth;
    }

    public void setFourth(FOU fourth) {
        this.fourth = fourth;
    }

    @Override
    public String toString() {
        return "Quadruple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                '}';
    }
}
