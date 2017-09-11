import org.junit.Test;

import static org.junit.Assert.*;

public class DrawAHorizontalLineTest {

    @Test
    public void printsAnEmptyString() {
        DrawAHorizontalLine line = new DrawAHorizontalLine();
        assertEquals("prints an empty string when given 0", "", line.printer(0));
    }

    @Test
    public void printsOnexAsterisk() {
        DrawAHorizontalLine line = new DrawAHorizontalLine();
        assertEquals("prints an asterisk when given 1", "*", line.printer(1));
    }

    @Test
    public void printsTwoAsterisks() {
        DrawAHorizontalLine line = new DrawAHorizontalLine();
        assertEquals("prints two asterisks when given 2", "**", line.printer(2));
    }

    @Test
    public void printsTenAsterisks() {
        DrawAHorizontalLine line = new DrawAHorizontalLine();
        assertEquals("prints ten asterisks when given 10", "**********", line.printer(10));
    }
}