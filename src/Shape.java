public abstract class Shape {
    SHAPETYPE type;

    public Shape(SHAPETYPE type) {
        this.type = type;
    }

    public SHAPETYPE getType() {
        return type;
    }

    public abstract double calculateField();
    public abstract double calculateCircuit();
}
