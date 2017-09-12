import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsoscelesTriangleTest {

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
    public void CentresAsteriskFor1() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        String result1 = StringUtils.center(isoscelesTriangle.printer(1), 10);
        assertEquals("prints a centred asterisk when given 1",result1, isoscelesTriangle.printer(1));
    }



    //    @Test
//    public void CentresAsteriskFor2() {
//        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
//        String result1 = StringUtils.center(isoscelesTriangle.printer(2), 10);
//        assertEquals("prints a centred asterisk when given 2", result1 , isoscelesTriangle.printer(2));
//    }
}