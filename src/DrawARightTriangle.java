public class DrawARightTriangle {

    String printer(int num) {
        String asterisk = "*";
        String numberAsAsterisk = null;
        for (int i = 0; i < num; i++) {
            numberAsAsterisk = asterisk;
        }
        return numberAsAsterisk + "\n";
    }

}
