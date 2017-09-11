import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;
import java.io.*;

public class EasiestExerciseEverTest {
    @Test
    public void printsAnAstericks() {
//        String astericks = "*";
        EasiestExerciseEver line = new EasiestExerciseEver();
        assertEquals("must print an astericks", "*", line.printer());
    }

}


