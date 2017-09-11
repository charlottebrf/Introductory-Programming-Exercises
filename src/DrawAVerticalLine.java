public class DrawAVerticalLine {


    public void printer(int num) {
        String asterisk = "*";
        for (int i = 0; i < num; i++) {
            System.out.println(asterisk);
        }
         System.out.println(" ");
    };

     public void main (int num) {
       printer(num);
    }
}
