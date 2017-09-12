    import org.junit.Test;

    import static org.junit.Assert.*;

    public class DiamondWithNameTest {

        @Test
        public void returnsADiamondWithName() {
            DiamondWithName diamondName = new DiamondWithName();
            String myName = "Charlotte";
            String result1 = diamondName.asteriskGenerator(1);
            result1 = diamondName.formatter(result1);
            String result2 = diamondName.asteriskGenerator(3);
            result2 = diamondName.formatter(result2);
            String result3 = myName;

            assertEquals("prints an Diamond of 1,3, Charlotte, 3, 1 asterisks when given 3", result1 + "\n" + result2 + "\n" + result3 + "\n" + result2 + "\n" + result1 + "\n", diamondName.printDiamond(3));
        }

    }