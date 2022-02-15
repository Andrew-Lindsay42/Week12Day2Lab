package vehicles;

import org.junit.Before;
import org.junit.Test;
import vehicles.parts.SteeringWheel;

import static org.junit.Assert.assertEquals;

public class SteeringWheelTest {

    SteeringWheel steeringWheel;

    @Before
    public void before(){
        steeringWheel = new SteeringWheel();
    }

    @Test
    public void canBeepHorn(){
        assertEquals("Beep beep!", steeringWheel.tootHorn());
    }
}
