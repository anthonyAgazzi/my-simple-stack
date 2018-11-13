package deqo.aaga.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    Item a;
    Item b;
    @Before
    public void setUp(){
        a = new Item(4,5);
        b = new Item(4,5, "abc");
    }

    @Test
    public void getA() {
        assertEquals(4, a.getA());
        assertNotEquals(5, a.getA());

        assertEquals(4, b.getA());
        assertNotEquals(5, b.getA());
    }

    @Test
    public void setA() {
        assertEquals(4, a.getA());
        assertNotEquals(5, a.getA());
        a.setA(2);
        assertEquals(2, a.getA());
        assertNotEquals(5, a.getA());
        assertNotEquals(5, a.getA());

        assertEquals(4, b.getA());
        assertNotEquals(5, b.getA());
        b.setA(2);
        assertEquals(2, b.getA());
        assertNotEquals(5, b.getA());
        assertNotEquals(5, b.getA());
    }

    @Test
    public void getB() {
        assertEquals(5, a.getB());
        assertNotEquals(4, a.getB());
        assertEquals(5, b.getB());
        assertNotEquals(4, b.getB());
    }

    @Test
    public void setB() {
        assertEquals(5, a.getB());
        assertNotEquals(4, a.getB());
        a.setB(1);
        assertEquals(1, a.getB());
        assertNotEquals(5, a.getB());
        assertNotEquals(4, a.getB());

        assertEquals(5, b.getB());
        assertNotEquals(4, b.getB());
        b.setB(1);
        assertEquals(1, b.getB());
        assertNotEquals(5, b.getB());
        assertNotEquals(4, b.getB());
    }


    @Test
    public void getC() {
        assertEquals("", a.getC());
        assertNotEquals("a", a.getC());

        assertEquals("abc", b.getC());
        assertNotEquals("", b.getC());
    }

    @Test
    public void setC() {
        assertEquals("", a.getC());
        assertNotEquals("4", a.getC());
        a.setC("abcde");
        assertEquals("abcde", a.getC());
        assertNotEquals("", a.getC());
        assertNotEquals("4", a.getC());


        assertEquals("abc", b.getC());
        assertNotEquals("4", b.getC());
        b.setC("abcde");
        assertEquals("abcde", b.getC());
        assertNotEquals("", b.getC());
        assertNotEquals("abc", b.getC());
    }
}