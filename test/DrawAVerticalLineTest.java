import org.junit.Test;

import static org.junit.Assert.*;

public class DrawAVerticalLineTest {

    @Test
    public void printsOneAsterisk() {
        DrawAVerticalLine verticalLine = new DrawAVerticalLine();
        assertEquals("prints one asterisk when given 1", System.out.print("*\n") verticalLine.main(1));
    }

    @Test
    public void printsTwoAsterisksOnNewLines() {
        DrawAVerticalLine verticalLine = new DrawAVerticalLine();
        assertEquals("prints two asterisks on new lines when given 2", "*\n*\n", verticalLine.main(2));
    }

}
