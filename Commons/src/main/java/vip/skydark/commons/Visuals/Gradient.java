package vip.skydark.commons.Visuals;

import java.awt.*;

public class Gradient {

    private Color from;
    private Color to;
    private int length;

    public Gradient(Color from, Color to, int length) {
        this.from = from;
        this.to = to;
        this.length = length;
    }

    public Color getFrom() {
        return from;
    }

    public void setFrom(Color from) {
        this.from = from;
    }

    public Color getTo() {
        return to;
    }

    public void setTo(Color to) {
        this.to = to;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Color[] getGradient() {
        Color[] colors = new Color[length];

        for (int i = 0; i < colors.length; i++) {
            double p = i * 1D / length;

            colors[i] = new Color(
                    (float) (from.getRed() * p + to.getRed() * (1 - p)) / 255f,
                    (float) (from.getGreen() * p + to.getGreen() * (1 - p)) / 255f,
                    (float) (from.getBlue() * p + to.getBlue() * (1 - p)) / 255f);
        }

        return colors;
    }

}
