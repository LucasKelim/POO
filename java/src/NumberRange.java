public class NumberRange {
    private int min = 0;
    private int max = 0;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int[] generate() {
        int[] range = new int[max - min + 1];

        for (int i = 0; i < range.length; i++) {
            range[i] = min + i;
        }

        return range;
    }
}
