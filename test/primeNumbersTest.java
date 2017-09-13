import org.junit.Test;
import java.lang.*;
import java.util.*;

import static org.junit.Assert.*;

public class primeNumbersTest {

    @Test
    public void returnsPrimeofOne() {
        primeNumbers prime = new primeNumbers();
        ArrayList<Integer> list = new ArrayList<Integer>(0);
        assertEquals("1 is not a prime number so returns empty", list , prime.generate(1));
    }

    @Test
    public void returnsPrimeofTwo() {
        primeNumbers prime = new primeNumbers();
        ArrayList<Integer> list = new ArrayList<Integer>(0);
        assertEquals("although 2 is a prime number algorithm won't return itself or 1", list , prime.generate(2));
    }

    @Test
    public void returnsPrimeofTwelve() {
        primeNumbers prime = new primeNumbers();
        ArrayList<Integer> list = new ArrayList<Integer>(0);
        list.add(2);
        list.add(3);
        assertEquals("2 & 3 are factors of 12 & prime numbers", list , prime.generate(12));
    }


    @Test
    public void returnsPrimeofThirty() {
        primeNumbers prime = new primeNumbers();
        ArrayList<Integer> list = new ArrayList<Integer>(0);
        list.add(2);
        list.add(3);
        list.add(5);
        assertEquals("2, 3 & 5 are factors of 30 & prime numbers", list , prime.generate(30));
    }

}