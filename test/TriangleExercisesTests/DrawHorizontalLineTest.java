package TriangleExercisesTests;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;
import java.io.*;

public class DrawHorizontalLineTest {
    @Test
    public void printsAnAstericks() throws Exception {
        assertEquals("*", new Display().printAstericks());
    }
}


