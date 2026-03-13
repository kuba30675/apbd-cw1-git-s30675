public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(SHAPETYPE.CIRCLE);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateField() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double calculateCircuit() {
        return 2 * Math.PI * radius;
    }
}
