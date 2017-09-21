public class DiamondWithNameVersion2 {
    private String asterisk = "*";

    public String makeAsterisk(int width) {
        String result = "";
        for (int i = 1; i <= width; i++) {
            result += asterisk;
        }
        return result;
    }


}
