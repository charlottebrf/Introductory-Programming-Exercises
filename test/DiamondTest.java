import org.junit.Test;

import static org.junit.Assert.*;

public class DiamondTest {

    @Test
    public void returnsATriangle() {
        Diamond diamond = new Diamond();
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        String result1 = isoscelesTriangle.asteriskGenerator(1);
        result1 = isoscelesTriangle.formatter(result1);
        String result2 = isoscelesTriangle.asteriskGenerator(3);
        result2 = isoscelesTriangle.formatter(result2);
        String result3 = isoscelesTriangle.asteriskGenerator(5);
        result3 = isoscelesTriangle.formatter(result3);

        assertEquals("prints an Isosceles of 1,3 & 5 asterisks when given 3", result1 + "\n" + result2 + "\n" + result3 + "\n", diamond.getIsosceles(3));
    }


}