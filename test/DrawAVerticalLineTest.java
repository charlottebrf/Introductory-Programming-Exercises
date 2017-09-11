import org.junit.Test;
import static org.junit.Assert.*;


 public class DrawAVerticalLineTest {

    @Test
    public void printsOneAsterisk() {
        DrawAVerticalLine verticalLine = new DrawAVerticalLine();
        String asterisk = "*\n";
        assertEquals("prints one asterisk when given 1", asterisk, verticalLine.printer(1));
    }

    @Test
    public void printsTwoAsterisksOnNewLines() {
        DrawAVerticalLine verticalLine = new DrawAVerticalLine();
        String asterisk2 = "*\n*\n";
        assertEquals("prints two asterisks on new lines when given 2", asterisk2, verticalLine.printer(2));
    }

}
