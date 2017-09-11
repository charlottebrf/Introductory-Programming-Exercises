import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsoscelesTriangleTest {

    @Test
    public void printsACentredAsterisk() {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        String result = isoscelesTriangle.printer(1);
        assertEquals("prints a centred asterisk when given 1", StringUtils.center(result, 10), result);
    }
//
//    @Test
//    public void printsACentredAsterisk() {
//        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
//        String result = isoscelesTriangle.printer(2);
//        assertEquals("prints a centred asterisk when given 1", StringUtils.center(result, 10), result);
//    }
}