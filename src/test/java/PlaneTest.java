import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOEING737, plane.getPlaneType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(270, PlaneType.BOEING737.getCapacity());
    }

    @Test
    public void hasTotalWeight() {
        assertEquals(550, PlaneType.BOEING737.getTotalWeight());
    }
}
