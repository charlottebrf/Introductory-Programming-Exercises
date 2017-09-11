public class DrawARightTriangle {

    String printer(int num) {
        String asterisk = "*";
        String numberAsAsterisk = new String();
        for (int i = 0; i < num; i++) {
             numberAsAsterisk = new String(new char[i]).replace("\0", asterisk);
        }
        return numberAsAsterisk + "\n";
    }

}
