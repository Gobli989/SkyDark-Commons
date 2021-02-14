package vip.skydark.commons.Visuals;

@SuppressWarnings("Untested")
public class ProgressBar {

    // TODO: Test this out

    private double progress;
    private double max;
    private int maxCharacters;
    private char barCharacter;
    private char emptyCharacter;

    public ProgressBar(double progress, double max, int maxCharacters, char barCharacter, char emptyCharacter) {
        this.progress = progress;
        this.max = max;
        this.maxCharacters = maxCharacters;
        this.barCharacter = barCharacter;
        this.emptyCharacter = emptyCharacter;
    }

    public ProgressBar(double progress, int maxCharacters) {
        this.progress = progress;
        this.maxCharacters = maxCharacters;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public int getMaxCharacters() {
        return maxCharacters;
    }

    public void setMaxCharacters(int maxCharacters) {
        this.maxCharacters = maxCharacters;
    }

    public char getBarCharacter() {
        return barCharacter;
    }

    public void setBarCharacter(char barCharacter) {
        this.barCharacter = barCharacter;
    }

    public char getEmptyCharacter() {
        return emptyCharacter;
    }

    public void setEmptyCharacter(char emptyCharacter) {
        this.emptyCharacter = emptyCharacter;
    }

    public String render() {
        StringBuilder sb = new StringBuilder();

        for (int c = 0; c < maxCharacters; c++) {
            double unit = maxCharacters / max;

            if (unit * c >= progress) sb.append(barCharacter);
            else sb.append(emptyCharacter);
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return "ProgressBar{" +
                "progress=" + progress +
                ", max=" + max +
                ", maxCharacters=" + maxCharacters +
                ", barCharacter='" + barCharacter + "'" +
                ", emptyCharacter='" + emptyCharacter + "'" +
                '}';
    }
}
