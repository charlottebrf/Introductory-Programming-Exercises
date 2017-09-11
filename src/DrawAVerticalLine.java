public class DrawAVerticalLine {

    public String printer(int num) {
        String result = "";
        String asterisk = "*";

        for (int i = 0; i < num; i++) {
            result += asterisk + "\n";
        }
        return result;
    }

}
