import org.junit.Before;
import org.junit.Test;
import java.lang.*;
import java.util.*;

import static org.junit.Assert.*;

public class primeNumbersTest {
    primeNumbers prime = new primeNumbers();
    Set<Integer> primeFactors = new HashSet<Integer>();

    @Before
    public void setUp() throws Exception {
        prime = new primeNumbers();
        primeFactors = new HashSet<Integer>();
    }

    @Test
    public void returnsPrimeofOne() {
        assertEquals( primeFactors, prime.primeNumberGenerator(1));
    }

    @Test
    public void returnsPrimeofTwo() {
        primeFactors.add(2);
        assertEquals(primeFactors, prime.primeNumberGenerator(2));
    }

    @Test
    public void returnsPrimeofTwelve() {
        primeFactors.add(2);
        primeFactors.add(3);
        assertEquals(primeFactors, prime.primeNumberGenerator(12));
    }

    @Test
    public void returnsPrimeofThirty() {
        primeFactors.add(2);
        primeFactors.add(3);
        primeFactors.add(5);
        assertEquals(primeFactors , prime.primeNumberGenerator(30));
    }

}