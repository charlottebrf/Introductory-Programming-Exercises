import org.junit.Test;

import static org.junit.Assert.*;

public class DrawAHorizontalLineTest {

    @Test
    public void printsOneAsterisk() {
        DrawAHorizontalLine line = new DrawAHorizontalLine();
        Integer one = 1;
        assertEquals("prints an asterisk when given 1", "*", line.printer(one));
    }

    @Test
    public void printsTwoAsterisks() {
        DrawAHorizontalLine line = new DrawAHorizontalLine();
        Integer two = 2;
        assertEquals("prints two asterisks when given 2", "**", line.printer(two));
    }
}