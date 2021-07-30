package generics.intro;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {
    private CircularBuffer<String> circularBuffer;

    @BeforeEach
    public void Setup(){
        this.circularBuffer = new CircularBuffer<>(2);
    }

    @Test
    public void canPopElement()
    {
        assertTrue(circularBuffer.push("a"));

        assertEquals("a", circularBuffer.pop());
        assertNull(circularBuffer.pop());
    }

    @Test
    public void cannNotPushWhenBufferIsFull(){
        assertTrue(circularBuffer.push("a"));
        assertTrue(circularBuffer.push("b"));
        assertFalse(circularBuffer.push("c"));
    }

    @Test
    public void canNotPopWhenBufferIsEmpty(){
        assertNull(circularBuffer.pop());
    }

    @Test
    public void shouldRecycleBuffer(){
        assertTrue(circularBuffer.push("a"));
        assertTrue(circularBuffer.push("b"));
        assertEquals("a", circularBuffer.pop());
        assertTrue(circularBuffer.push("c"));
        assertEquals("b", circularBuffer.pop());
        assertEquals("c", circularBuffer.pop());
    }

    @Test
    public void canToStringStrings(){
        circularBuffer = new CircularBuffer<>(10);
        circularBuffer.push("a");
        circularBuffer.push("bc");
        circularBuffer.push("d");

        System.out.println(concatenate(circularBuffer));
    }

    private String concatenate(CircularBuffer<String> circularBuffer){
        StringBuilder result = new StringBuilder();
        String value;
        while ((value = circularBuffer.pop()) != null){   //this CASTS the result of the pop method into a String.  It might not be a string!
            result.append(value);
        }
        return result.toString();
    }

}