public class Square extends Shape{
    private final double a;

    public Square(double a) {
        super(SHAPETYPE.SQUARE);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

    @Override
    public double calculateField() {
        return a * a;
    }

    @Override
    public double calculateCircuit() {
        return 4 * a;
    }
}
