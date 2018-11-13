package deqo.aaga.mysimplestack;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class ex3Test {

    Item a;
    ex3 b;
    @Rule
    public ExpectedException execptionable = ExpectedException.none();

    @Before
    public void setUp(){
        a = new Item(4,5);
        b = new ex3();
    }
    @Test
    public void isEmpty() {
        assertEquals(true,b.isEmpty());
        b.push(a);
        assertEquals(false,b.isEmpty());
    }

    @Test
    public void getSize() {
        for(int i=0; i<10; i++){
            assertEquals(i,b.getSize());
            b.push(a);
        }
    }

    @Test
    public void push() {
        for(int i=0; i<10; i++){
            assertEquals(i,b.getSize());
            b.push(a);
        }
    }

    @Test
    public void peek() {
        b.push(a);
        assertEquals(a,b.peek());
        b.pop();
        execptionable.expect(EmptyStackException.class);
        b.peek();
    }

    @Test
    public void pop() {
        for(int i=0; i<10; i++){
            b.push(a);
        }
        for(int i=0; i<10; i++){
            assertEquals(10-i,b.getSize());
            assertEquals(a,b.pop());
        }
        execptionable.expect(EmptyStackException.class);
        b.pop();
    }
}