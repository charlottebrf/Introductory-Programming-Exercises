import org.apache.commons.lang3.StringUtils;

public class DiamondWithNameVersion2 {
    private String asterisk = "*";

    public String makeAsterisk(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            result += asterisk;
        }
        return result;
    }

    public String makeSpace(int num) {
        String space = "";
        for (int i = 1; i <= num; i++) {
            space += " ";
        }
        return space;
    }

    public String removeAsterisk(String asterisks, int num) {
        StringBuilder newAsterisks = new StringBuilder(asterisks);
        newAsterisks.replace(0, num, "");
        return newAsterisks.toString();
    }


    public String generator(int num) {
        int numPlusTwo = num + 2;
        asterisk = makeAsterisk(numPlusTwo);
        int numBlankSpaces = 0;
        String asteriskForI = null;
        String diamond = "";

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                numBlankSpaces += numPlusTwo - i;
                asteriskForI += removeAsterisk(asterisk, numBlankSpaces);
                diamond += asteriskForI + "\n";
            }
        }
        return diamond;
    }
}
