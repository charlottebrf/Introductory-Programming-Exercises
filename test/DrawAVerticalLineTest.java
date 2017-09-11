import org.junit.Test;
import java.io.*;
//import static java.lang.System.*;

import static org.junit.Assert.*;

public class DrawAVerticalLineTest {
//    OutputStream os = new ByteArrayOutputStream();
//    PrintStream ps = new PrintStream(os);
//    System printed = System.setOut(ps);

    @Test
    public void printsOneAsterisk() {
        DrawAVerticalLine verticalLine = new DrawAVerticalLine();
        String asterisk = "*\n";
        assertEquals("prints one asterisk when given 1", java.lang.System.out.println(asterisk), verticalLine.main(1));
    }

    @Test
    public void printsTwoAsterisksOnNewLines() {
        DrawAVerticalLine verticalLine = new DrawAVerticalLine();
        assertEquals("prints two asterisks on new lines when given 2", System.out.print("*\n*\n"), verticalLine.main(2));
    }

}
