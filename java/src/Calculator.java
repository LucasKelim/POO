public class Calculator {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double addition() {
        return a + b;
    }

    public double subtraction() {
        return a - b;
    }

    public double multiplication() {
        return a * b;
    }

    public double division() {
        return b != 0 ? a / b : Double.NaN;
    }
}
