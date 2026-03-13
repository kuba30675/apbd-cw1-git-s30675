//represents equilateral triangle
public class Triangle extends Shape{
    private double a;

    public Triangle(double a) {
        super(SHAPETYPE.TRIANGLE);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double calculateField() {
        return Math.pow(a, 2) * Math.sqrt(3) / 4;
    }

    @Override
    public double calculateCircuit() {
        return 3 * a;
    }
}
