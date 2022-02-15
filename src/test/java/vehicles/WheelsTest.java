package vehicles;

import org.junit.Before;
import org.junit.Test;
import vehicles.parts.Wheels;

import static org.junit.Assert.assertEquals;

public class WheelsTest {

    Wheels wheels;

    @Before
    public void before(){
        wheels = new Wheels("Continental", 24);
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Continental", wheels.getTyreManufacturer());
    }

    @Test
    public void hasSize(){
        assertEquals(24, wheels.getSize());
    }
}
