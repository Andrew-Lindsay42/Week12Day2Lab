package people;

import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.CarType;
import vehicles.parts.Engine;
import vehicles.parts.SteeringWheel;
import vehicles.parts.Wheels;

import static org.junit.Assert.assertEquals;

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
    public void canChangeMoney(){
        customer.setMoney(16);
        assertEquals(16, customer.getMoney(), 0);
    }

    @Test
    public void collectionStartsAt0() {
        assertEquals(0, customer.countCars());
    }

    @Test
    public void canAddCarToCollection(){
        customer.buyCar(car);
        assertEquals(1, customer.countCars());
    }

    @Test
    public void canRemoveCarFromCollection(){
        customer.buyCar(car);
        customer.sellCar(car);
        assertEquals(0, customer.countCars());
    }
}
