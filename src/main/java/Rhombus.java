public class Rhombus implements Figure {
    private final double side;
    private final double height;

    public Rhombus(double side, double height) {
        this.height = height;
        this.side = side;
    }

    public double getArea() {
        return side * height;
    }

    public double getCircuit() {
        return 4 * side;
    }
}
