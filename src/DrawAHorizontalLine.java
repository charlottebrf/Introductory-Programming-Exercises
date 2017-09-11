public class DrawAHorizontalLine {

    String asterisk = "*";


    String printer(int width) {
        String result = "";
        for (int i = 1; i <= width; i++) {
            result += asterisk;
        }
        return result;
    }

}
