public class Rectangle implements Figure {
    protected final double sideA;
    protected final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea() {
        return sideA * sideB;
    }

    public double getCircuit() {
        return 2 * sideB + 2 * sideA;
    }
}
