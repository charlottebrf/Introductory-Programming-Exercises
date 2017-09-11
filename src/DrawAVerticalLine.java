public class DrawAVerticalLine {


    static void printer(Integer num) {
        String asterisk = "*";
        for (int i = 0; i < num; i++) {
            System.out.println(asterisk);
        }
        System.out.println("");
    }

    static void main (int num) {
       printer(num);
    }
}
