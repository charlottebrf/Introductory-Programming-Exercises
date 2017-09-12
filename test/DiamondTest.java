import org.junit.Test;

import static org.junit.Assert.*;

public class DiamondTest {

    @Test
    public void returnsATriangle() {
        Diamond diamond = new Diamond();
        String result1 = diamond.asteriskGenerator(1);
        result1 = diamond.formatter(result1);
        String result2 = diamond.asteriskGenerator(3);
        result2 = diamond.formatter(result2);
        String result3 = diamond.asteriskGenerator(5);
        result3 = diamond.formatter(result3);

        assertEquals("prints an Isosceles of 1,3 & 5 asterisks when given 3", result1 + "\n" + result2 + "\n" + result3 + "\n", diamond.rightsideUpIsosceles(3));
    }

    @Test
    public void returnstheRestOfTheTriangle() {
        Diamond diamond = new Diamond();
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        String result1 = isoscelesTriangle.asteriskGenerator(1);
        result1 = isoscelesTriangle.formatter(result1);
        String result2 = isoscelesTriangle.asteriskGenerator(3);
        result2 = isoscelesTriangle.formatter(result2);

        assertEquals("prints an Isosceles of 1,3 & 5 asterisks when given 3", result2 + "\n" + result1 + "\n", diamond.upsideDownIsosceles(3));
    }

    @Test
    public void returnsADiamond() {
        Diamond diamond = new Diamond();
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        String result1 = isoscelesTriangle.asteriskGenerator(1);
        result1 = isoscelesTriangle.formatter(result1);
        String result2 = isoscelesTriangle.asteriskGenerator(3);
        result2 = isoscelesTriangle.formatter(result2);
        String result3 = diamond.asteriskGenerator(5);
        result3 = diamond.formatter(result3);

        assertEquals("prints an Diamond of 1,3, 5, 3, 1 asterisks when given 3", result1 + "\n" + result2 + "\n" + result3 + "\n" + result2 + "\n" + result1 + "\n", diamond.printDiamond(3));
    }


}