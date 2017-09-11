public class DrawAVerticalLine {


    public static void printer(int num) {
        String asterisk = "*";
        for (int i = 0; i < num; i++) {
            System.out.println(asterisk);
        }
         System.out.println(" ");
    };

     public static void main (int num) {
       printer(num);
    }
}
