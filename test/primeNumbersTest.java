import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class primeNumbersTest {

    @Test
    public void returnsPrimeofOne() {
        primeNumbers prime = new primeNumbers();
        ArrayList<Integer> list = new ArrayList<Integer>(0);
        assertEquals("returns only prime for 1", list , prime.generate(1));
    }

    @Test
    public void returnsPrimeofTwo() {
        primeNumbers prime = new primeNumbers();
        ArrayList<Integer> list = new ArrayList<Integer>(0);
        assertEquals("returns only prime for 1", list , prime.generate(2));
    }
}