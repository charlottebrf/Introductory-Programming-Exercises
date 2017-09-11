import org.junit.Test;
import static org.junit.Assert.*;


public class DrawARightTriangleTest {

    @Test
    public void drawsOneLineFor1() throws Exception {
        DrawARightTriangle triangle = new DrawARightTriangle();
        assertEquals("prints 1 side of the triangle", "*\n", triangle.printer(1));
    }

    @Test
    public void drawsTwoLineFor2() throws Exception {
        DrawARightTriangle triangle = new DrawARightTriangle();
        assertEquals("prints 2 sides of the triangle", "*\n**\n", triangle.printer(2));
    }


    @Test
    public void drawsAnotherAsteriskLine() throws Exception {
        DrawARightTriangle triangle = new DrawARightTriangle();
        assertEquals("prints 2 sides of the triangle", "*\n**\n***", triangle.printer(3));
    }
}
