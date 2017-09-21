import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiamondWithNameVersion2Test {
    DiamondWithNameVersion2 diamond = new DiamondWithNameVersion2();

    @Before
    public void setUp() {
        diamond = new DiamondWithNameVersion2();
    }

    @Test
    public void printsAsterisksForAGivenNum() {
        assertEquals("***", diamond.asterisk(3));
    }

    @Test
    public void printsSpacesForAGivenNum() {
        assertEquals(" ", diamond.blanks(1));
    }

    @Test
    public void printsSpacesForAnotherGivenNum() {
        assertEquals("   ", diamond.blanks(3));
    }

    @Test
    public void generatesADiamondShapeWithName() {
        assertEquals("  *  \n *** \nCharlotte\n *** \n  *  \n", diamond.generator(3, "Charlotte"));
    }

    @Test
    public void addsAName() {
        assertEquals("Charlotte\n", diamond.addMyName("Charlotte"));
    }
}