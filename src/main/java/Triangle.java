public class Triangle implements Figure {
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final double heightToSideA;

    public Triangle(double sideA, double sideB, double sideC, double heightToSideA) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightToSideA = heightToSideA;
    }

    public double getArea() {
        return .5 * heightToSideA * sideA;
    }

    public double getCircuit() {
        return sideA + sideB + sideC;
    }
}
