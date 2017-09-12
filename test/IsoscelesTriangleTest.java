import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsoscelesTriangleTest {
    //refactor tests to use a helper method for creating new instances of the class & invoking methods

    @Test
    public void SubtractsTwoFromANumber() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        assertEquals("subracts 2 from a given number", 1, isoscelesTriangle.subtractTwo(3));
    }

    @Test
    public void SubtractsTwoFromAnotherNumber() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        assertEquals("subracts 2 from a given number", 3, isoscelesTriangle.subtractTwo(5));
    }

    @Test
    public void SubtractsTwoFromANumberIfGreaterThanOne() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        assertEquals("subtracts two if number is greater than one", 1, isoscelesTriangle.GreaterThanOne(3));
    }

    @Test
    public void IfOneReturnsOne() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        assertEquals("returns one if number is one", 1, isoscelesTriangle.GreaterThanOne(1));
    }

    //This could be a good test to practice exceptions on
    @Test
    public void IfZeroReturnsZero() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        assertEquals("returns zero if number is zero or less", 0, isoscelesTriangle.GreaterThanOne(0));
    }

    @Test
    public void IfLessThanZeroReturnsZero() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        assertEquals("returns zero if number is zero or less", 0, isoscelesTriangle.GreaterThanOne(-7));
    }

    @Test
    public void addsTwoToANumber() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        assertEquals("adds 2 to a given number", 5, isoscelesTriangle.addTwo(3));
    }

    @Test
    public void checksIfANumberIsOdd() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        assertEquals("returns odd numbers", 3, isoscelesTriangle.checkOdd(3));
    }

    @Test
    public void returnsZeroForEven() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        assertEquals("doesn't return evens", 0 , isoscelesTriangle.checkOdd(2));
    }

    @Test
    public void printsAsterisksForOne() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        String result1 = StringUtils.center(isoscelesTriangle.subtractionPrinter(1), 10);
        assertEquals("prints a centred asterisk when given 1",result1, isoscelesTriangle.subtractionPrinter(1));
    }

        @Test
    public void printsAsterisksForOddsUpToNumber() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
       String result1 = isoscelesTriangle.asteriskGenerator(1);
       result1 = isoscelesTriangle.formatter(result1);
       String result2 = isoscelesTriangle.asteriskGenerator(3);
       result2 = isoscelesTriangle.formatter(result2);

        assertEquals("prints 1 & then 3 asterisk when given 2", result1 + "\n" + result2 + "\n", isoscelesTriangle.subtractionPrinter(3));
    }

    @Test
    public void printsAsterisksForNumberPlusTwo() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        String result1 = isoscelesTriangle.asteriskGenerator(5);
        result1 = isoscelesTriangle.formatter(result1);

        assertEquals("prints 1 & then 3 asterisk when given 2", result1 + "\n", isoscelesTriangle.additionPrinter(3));
    }

    @Test
    public void printsAnIsoscelesForANumber() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        String result1 = isoscelesTriangle.asteriskGenerator(1);
        result1 = isoscelesTriangle.formatter(result1);
        String result2 = isoscelesTriangle.asteriskGenerator(3);
        result2 = isoscelesTriangle.formatter(result2);
        String result3 = isoscelesTriangle.asteriskGenerator(5);
        result3 = isoscelesTriangle.formatter(result3);

        assertEquals("prints an Isosceles of 1,3 & 5 asterisks when given 3", result1 + "\n" + result2 + "\n" + result3 + "\n", isoscelesTriangle.Printer(3));
    }


}