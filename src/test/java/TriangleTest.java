import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    private final double DELTA = 10e-15;

    @Test
    public void testTriangleCircuitOne() {
        double a = 10;
        double b = 1;
        double c = 12;
        double height = 20;

        Figure triangle = new Triangle(a,b,c, height);

        Assert.assertEquals(23, triangle.getCircuit(), DELTA);
    }

    @Test
    public void testTriangleCircuitTwo() {
        double a = 10000;
        double b = 12000;
        double c = 33000;
        double height = 20;


        Figure triangle = new Triangle(a,b,c, height);

        Assert.assertEquals(55000, triangle.getCircuit(), DELTA);
    }

    @Test
    public void testTriangleAreaOne() {
        double a = 1005;
        double b = 10;
        double c = 10;
        double height = 20;

        Figure triangle = new Triangle(a,b,c, height);

        Assert.assertEquals(10050, triangle.getArea(), DELTA);
    }

    @Test
    public void testTriangleAreaTwo() {
        double a = 0.001;
        double b = 0.001;
        double c = 0.001;
        double height = 0.005;

        Figure triangle = new Triangle(a, b,c,height);

        Assert.assertEquals(0.0000025, triangle.getArea(), DELTA);
    }
}
