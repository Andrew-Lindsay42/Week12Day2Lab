package places;

import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.CarType;
import vehicles.parts.Engine;
import vehicles.parts.SteeringWheel;
import vehicles.parts.Wheels;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Engine engine;
    Wheels wheels;
    SteeringWheel steeringWheel;
    Car car1;
    Car car2;
    ArrayList<Car> cars;
    Dealership dealership;

    @Before
    public void before(){
        engine = new Engine(4.2, 500);
        wheels = new Wheels("Continental", 24);
        steeringWheel = new SteeringWheel();
        car1 = new Car("VW", "Golf", 32000, "Red", engine, wheels, steeringWheel, 5, CarType.HYBRID);
        car2 = new Car("VW", "Golf", 33000, "Hot Pink", engine, wheels, steeringWheel, 5, CarType.HYBRID);
        cars = new ArrayList<>(Arrays.asList(car1, car2));
        dealership = new Dealership("Jessie & Andrew's chop shop", 100000, cars);
    }

    @Test
    public void hasName(){
        assertEquals("Jessie & Andrew's chop shop", dealership.getName());
    }

    @Test
    public void canChangeName(){
        dealership.setName("Jessie & Andrew's reputable car dealership");
        assertEquals("Jessie & Andrew's reputable car dealership", dealership.getName());
    }

    @Test
    public void hasTill(){
        assertEquals(100000, dealership.getTill(), 0);
    }

    @Test
    public void canUpdateTill(){
        dealership.setTill(132000);
        assertEquals(132000, dealership.getTill());
    }

    @Test
    public void hasStock(){
        assertEquals(2, dealership.countCars());
    }

    @Test
    public void canAddCar(){
        dealership.addCar(car1);
        assertEquals(3, dealership.countCars());
    }

    @Test
    public void canSellCar(){
        dealership.sellCar(car1);
        assertEquals(1, dealership.countCars());
    }
}
