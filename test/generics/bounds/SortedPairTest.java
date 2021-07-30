package generics.bounds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedPairTest {

    @Test
    public void shouldRetrainOrderOfOrderedPair(){
        SortedPair<Integer> sortedPair = new SortedPair<>(1,2);
        assertEquals(1, sortedPair.getFirst());
        assertEquals(2, sortedPair.getSecond());
    }

    @Test
    void shouldFlipOrderOfMisorderedPair(){
        SortedPair<Integer> sortedPair = new SortedPair<>(2,1);
        assertEquals(1, sortedPair.getFirst());
        assertEquals(2, sortedPair.getSecond());
    }
}