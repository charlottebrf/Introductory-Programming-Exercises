import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsoscelesTriangleTest {

    @Test
    public void CentresAsteriskFor1() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        String result1 = StringUtils.center(isoscelesTriangle.printer(1), 10);
        assertEquals("prints a centred asterisk when given 1",result1, isoscelesTriangle.printer(1));
    }

    @Test
    public void CentresAsteriskFor2() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        String result1 = StringUtils.center(isoscelesTriangle.printer(2), 10);
        assertEquals("prints a centred asterisk when given 2", result1 , isoscelesTriangle.printer(2));
    }
}