package vehicles;

import org.junit.Before;
import org.junit.Test;
import vehicles.parts.Engine;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    Engine engine;

    @Before
    public void before(){
        engine = new Engine(4.2, 500);
    }

    @Test
    public void hasSize(){
        assertEquals(4.2, engine.getSize());
    }

    @Test
    public void hasBHP(){
        assertEquals(500, engine.getHorsepower());
    }

    @Test
    public void canStart(){
        assertEquals("Vroom", engine.start());
    }

    @Test
    public void canStop(){
        assertEquals("---", engine.stop());
    }
}
