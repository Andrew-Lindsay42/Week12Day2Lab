package people;

import org.junit.Before;
import org.junit.Test;
import places.Dealership;
import vehicles.Car;
import vehicles.CarType;
import vehicles.parts.Engine;
import vehicles.parts.SteeringWheel;
import vehicles.parts.Wheels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class CustomerTest {

    Engine engine;
    Wheels wheels;
    SteeringWheel steeringWheel;
    Car car;
    Customer customer;

    @Before
    public void before(){
        engine = new Engine(4.2, 500);
        wheels = new Wheels("Continental", 24);
        steeringWheel = new SteeringWheel();
        car = new Car("VW", "Golf", 32000, "Red", engine, wheels, steeringWheel, 5, CarType.HYBRID);
        customer = new Customer("Paul", 12);
    }

    @Test
    public void hasName(){
        assertEquals("Paul", customer.getName());
    }

    @Test
    public void hasMoney(){
        assertEquals(12, customer.getMoney(), 0);
    }

    @Test
    public void canIncreaseMoney(){
        customer.increaseMoney(16);
        assertEquals(28, customer.getMoney(), 0);
    }

    @Test
    public void canDecreaseMoney(){
        customer.decreaseMoney(10);
        assertEquals(2, customer.getMoney(), 0);
    }

    @Test
    public void collectionStartsAt0() {
        assertEquals(0, customer.countCars());
    }

    @Test
    public void canAddCarToCollection(){
        customer.increaseMoney(100000);
        customer.buyCar(car);
        assertEquals(1, customer.countCars());
        assertEquals(68012, customer.getMoney(), 0);
    }

    @Test
    public void canRemoveCarFromCollection(){
        customer.increaseMoney(100000);
        customer.buyCar(car);
        customer.sellCar(car);
        assertEquals(0, customer.countCars());
        assertEquals(100012, customer.getMoney(), 0);
    }

    @Test
    public void canAffordCar(){
        customer.increaseMoney(100000);
        assertTrue(customer.canAfford(car));
    }

    @Test
    public void cannotAffordCar(){
        assertFalse(customer.canAfford(car));
    }
}
