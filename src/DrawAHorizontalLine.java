public class DrawAHorizontalLine {

    String asterisk = "*";

    String printer(Integer width) {
        return new String(new char[width]).replace("\0", asterisk);
    }

}
