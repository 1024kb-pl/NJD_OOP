import org.junit.Assert;
import org.junit.Test;

public class RhombusTest {
    private final double DELTA = 10e-15;

    @Test
    public void testRhombusCircuitOne() {
        double a = 10;
        double height = 20;

        Figure rhombus = new Rhombus(a, height);

        Assert.assertEquals(40, rhombus.getCircuit(), DELTA);
    }

    @Test
    public void testRhombusCircuitTwo() {
        double a = 10000;
        double height = 20;


        Figure rhombus = new Rhombus(a, height);

        Assert.assertEquals(40000, rhombus.getCircuit(), DELTA);
    }

    @Test
    public void testRhombusAreaOne() {
        double a = 10;
        double height = 20;

        Figure rhombus = new Rhombus(a, height);

        Assert.assertEquals(200, rhombus.getArea(), DELTA);
    }

    @Test
    public void testRhombusAreaTwo() {
        double a = 0.01;
        double height = 0.005;

        Figure rhombus = new Rhombus(a, height);

        Assert.assertEquals(0.00005, rhombus.getArea(), DELTA);
    }
}
