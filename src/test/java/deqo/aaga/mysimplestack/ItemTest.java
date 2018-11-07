package deqo.aaga.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    Item a;
    @Before
    public void setUp(){
        a = new Item(4,5);
    }
    @Test
    public void getA() {
        assertEquals(4, a.getA());
        assertNotEquals(5, a.getA());
    }

    @Test
    public void setA() {
        assertEquals(4, a.getA());
        assertNotEquals(5, a.getA());
        a.setA(2);
        assertEquals(2, a.getA());
        assertNotEquals(5, a.getA());
        assertNotEquals(5, a.getA());
    }

    @Test
    public void getB() {
        assertEquals(5, a.getB());
        assertNotEquals(4, a.getB());
    }

    @Test
    public void setB() {
        assertEquals(5, a.getB());
        assertNotEquals(4, a.getB());
        a.setB(1);
        assertEquals(1, a.getB());
        assertNotEquals(5, a.getB());
        assertNotEquals(4, a.getB());
    }
}