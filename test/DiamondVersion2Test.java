import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiamondVersion2Test {
    DiamondVersion2 diamond = new DiamondVersion2();

    @Before
    public void setUp() {
        diamond = new DiamondVersion2();
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
    public void generatesADiamondShape() {
        assertEquals("  *  \n *** \n*****\n *** \n  *  \n", diamond.generator(3));
    }
}