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
        assertEquals("***", diamond.makeAsterisk(3));
    }

    @Test
    public void printsSpacesForAGivenNum() {
        assertEquals(" *** ", diamond.makeSpace("***", 1));
    }

    @Test
    public void printsSpacesForAnotherGivenNum() {
        assertEquals("   ***   ", diamond.makeSpace("***", 3));
    }
}