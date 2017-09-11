public class DrawAHorizontalLine {

    String asterisk = "*";

    String printer(Integer num) {
        return new String(new char[num]).replace("\0", asterisk);
    }

}
