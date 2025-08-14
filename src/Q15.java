public class Q15 {
    public static void main(String[] args) {
        int n1 = 38;
        int n2 = 39;
        float s = 0;
        for (int i = 1; i < n1; i++) {
            s += (float) (((n1 - i) * (n2 - i)) / i);
        }
        System.out.println("S = " + s);
    }
}
