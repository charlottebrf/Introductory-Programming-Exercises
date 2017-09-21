public class DiamondWithNameVersion2 {

    public String asterisk(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            result += "*";
        }
        return result;
    }

    public String blanks(int num) {
        String space = "";
        for (int i = 1; i <= num; i++) {
            space += " ";
        }
        return space;
    }

    public String generator(int num) {
        return topDiamond(num) + bottomDiamond(num);
    }

    private String bottomDiamond(int num) {
        String result = "";
        for (int i = num - 2; i >= 0; i--) {
            result += row(num, i);
        }
        return result;
    }

    private String topDiamond(int num) {
        String result = "";

        for (int i = 0; i <= num - 1; i++) {
            result += row(num, i);
        }
        return result;
    }

    private String row(int num, int i) {
        int totalBlanks = num + 1 - 2 * i;
        String blanks = blanks(totalBlanks / 2);
        return blanks + asterisk(2 * i + 1) + blanks + "\n";
    }

}
