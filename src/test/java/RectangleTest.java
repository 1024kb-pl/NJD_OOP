import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    private final double DELTA = 10e-15;

    @Test
    public void testRectangleCircuitOne() {
        double a = 10;
        double b = 20;

        Figure rectangle = new Rectangle(a, b);

        Assert.assertEquals(60, rectangle.getCircuit(), DELTA);
    }

    @Test
    public void testRectangleCircuitTwo() {
        double a = 10000;
        double b = 0.001;

        Figure rectangle = new Rectangle(a, b);

        Assert.assertEquals(20000.002, rectangle.getCircuit(), DELTA);
    }

    @Test
    public void testRectangleAreaOne() {
        double a = 0.001;
        double b = 0.0005;

        Figure rectangle = new Rectangle(a, b);

        Assert.assertEquals(0.0000005, rectangle.getArea(), DELTA);
    }

    @Test
    public void testRectangleAreaTwo() {
        double a = 10000;
        double b = 1000;

        Figure rectangle = new Rectangle(a, b);

        Assert.assertEquals(10000 * 1000, rectangle.getArea(), DELTA);
    }
}
