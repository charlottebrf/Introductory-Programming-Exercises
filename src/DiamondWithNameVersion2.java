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

    public String makeSpace(String asterisks, int num) {
        String space = "";
        for (int i = 1; i <= num; i++) {
            space += " ";
        }
        return space + asterisks + space + "\n";
    }

    public String removeAsterisk(String asterisks, int num) {
        StringBuilder newAsterisks = new StringBuilder(asterisks);
        newAsterisks.replace(0,  num, "");
        return newAsterisks.toString();
    }
}

//    public String generator(int num) {
//        int numPlusTwo = num + 2;
//        asterisk = makeAsterisk(numPlusTwo);
//        int numBlankSpaces = 0;
//        String asterickForI;
//        String diamond = "";
//
//        for(int i = 1; i <= numPlusTwo; i++) {
//            asterickForI = makeAsterisk(i);
//            numBlankSpaces = numPlusTwo - i;
//            diamond += makeSpace(asterickForI, )
//        }
//
//    }



//    public String generator(int num) {
//        String asterisk = "";
//        String topHalfDiamond = ";";
//        int numPlusTwo = num + 2;
//        asterisk = makeAsterisk(numPlusTwo);
//        int numBlankSpaces = 0;
//        String asterickForI;
//        String diamond = "";
//
//        for(int i = 1; i <= num; i++) {
//            if((i % 2) != 0) {
//                numBlankSpaces += numPlusTwo - i;
//                numBlankSpaces += numPlusTwo / 2;
//                asterickForI = makeAsterisk(i);
//                topHalfDiamond += makeSpace(asterickForI, numBlankSpaces);
//            }
//
//        }
//        String bottomHalfOfDiamond = new StringBuilder(topHalfDiamond).reverse().toString();
//        diamond = topHalfDiamond + asterisk + "\n" + bottomHalfOfDiamond;
//        return centerAString(diamond);
//    }
//
//    public String centerAString(String string) {
//        return StringUtils.center(string, 20);
//    }