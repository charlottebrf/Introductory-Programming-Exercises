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
    public void printsAsterisksForAGivenLine() {
        assertEquals("***", diamond.makeAsterisk(3));
    }
}