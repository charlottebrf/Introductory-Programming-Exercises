import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void printsOne() {
        FizzBuzz fizzy = new FizzBuzz();
        assertEquals("returns 1 as not divisible by 3 or 5", "1\n", fizzy.fizzOrBuzz(1));
    }

    @Test
    public void printsNumbersNotDivisbleBy3or5() {
        FizzBuzz fizzy = new FizzBuzz();
        assertEquals("returns 2 as not divisible by 3 or 5", "2\n", fizzy.fizzOrBuzz(2));
    }

    @Test
    public void printsFizzForMultiplesofThree() {
        FizzBuzz fizzy = new FizzBuzz();
        assertEquals("returns fizz when divisible by 3 but not by 5", "Fizz\n", fizzy.fizzOrBuzz(3));
    }

    @Test
    public void printsBuzzForMultiplesofFive() {
        FizzBuzz fizzy = new FizzBuzz();
        assertEquals("returns buzz when divisible by 5 but not by 3", "Buzz\n", fizzy.fizzOrBuzz(5));
    }

    @Test
    public void printsFizzBuzzForMultiplesofThreeAndFive() {
        FizzBuzz fizzy = new FizzBuzz();
        assertEquals("returns fizzbuzz when  divisible by 3 or 5", "FizzBuzz\n", fizzy.fizzOrBuzz(15));
    }

    @Test
    public void printsAllFizzBuzzOptions() {
        FizzBuzz fizzy = new FizzBuzz();
        assertEquals("returns all options when given a number", "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n", fizzy.printer(15));
    }

}