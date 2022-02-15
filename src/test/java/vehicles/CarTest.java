package vehicles;

import org.junit.Before;
import org.junit.Test;
import vehicles.parts.Engine;
import vehicles.parts.SteeringWheel;
import vehicles.parts.Wheels;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Engine engine;
    Wheels wheels;
    SteeringWheel steeringWheel;
    Car car;

    @Before
    public void before(){
        engine = new Engine(4.2, 500);
        wheels = new Wheels("Continental", 24);
        steeringWheel = new SteeringWheel();
        car = new Car("VW", "Golf", 32000, "Red", engine, wheels, steeringWheel, 5, CarType.HYBRID);
    }

    @Test
    public void hasMake(){
        assertEquals("VW", car.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Golf", car.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(32000, car.getPrice(), 0);
    }

    @Test
    public void hasColour(){
        assertEquals("Red", car.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasWheels(){
        assertEquals(wheels, car.getWheels());
    }

    @Test
    public void hasSteeringWheel(){
        assertEquals(steeringWheel, car.getSteeringWheel());
    }

    @Test
    public void hasSeats(){
        assertEquals(5, car.getSeats());
    }

    @Test
    public void hasType(){
        assertEquals(CarType.HYBRID, car.getType());
    }

    @Test
    public void canDrive(){
        assertEquals("Neeeoowww", car.drive());
    }
}
