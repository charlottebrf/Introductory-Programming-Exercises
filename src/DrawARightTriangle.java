public class DrawARightTriangle {

    public String printer(int num) {
        String result = "";
        DrawAHorizontalLine horizontalLine = new DrawAHorizontalLine();
        for (int i = 1; i <= num; i++) {
            result += horizontalLine.printer(i) + "\n";
            }
        return result;
    }

}
