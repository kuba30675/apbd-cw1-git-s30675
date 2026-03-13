//represents equilateral triangle
public class Triangle extends Shape{
    private double a;
    private double height;

    public Triangle(double a) {
        super(SHAPETYPE.TRIANGLE);
        this.a = a;
        this.height = (a * Math.sqrt(3)) / 2;
    }

    public double getA() {
        return a;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateField() {
        return Math.pow(a, 2) * Math.sqrt(3) / 4;
    }

    @Override
    public double calculateCircuit() {
        return 3 * a;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", height=" + height +
                '}';
    }
}
