import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    private final double DELTA = 10e-15;

    @Test
    public void testSquareCircuitOne() {
        double a = 10;

        Figure square = new Square(a);

        Assert.assertEquals(40, square.getCircuit(), DELTA);
    }

    @Test
    public void testSquareCircuitTwo() {
        double a = 10000;

        Figure square = new Square(a);

        Assert.assertEquals(40000, square.getCircuit(), DELTA);
    }

    @Test
    public void testSquareAreaOne() {
        double a = 10;

        Figure square = new Square(a);

        Assert.assertEquals(100, square.getArea(), DELTA);
    }

    @Test
    public void testSquareAreaTwo() {
        double a = 10000;

        Figure square = new Square(a);

        Assert.assertEquals(10000 * 10000, square.getArea(), DELTA);
    }
}
