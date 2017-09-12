import org.apache.commons.lang3.StringUtils;
import java.util.*;

public class IsoscelesTriangle {

    public int subtractTwo(int num) {
        return num - 2;
    }

    public int GreaterThanOne(int num) {
        int result = 0;
        if (num > 1) {
            result += this.subtractTwo(num);
        } else if (num == 1) {
            result += 1;
        } else {
            result += 0;
        }
        return result;
    }

    public String printer(int num) {
        String result = "";
        DrawARightTriangle rightTriangle = new DrawARightTriangle();
        for (int i = 1; i <= num; i++) {
            result += StringUtils.center(rightTriangle.printer(i), 10);
        }
        return result;
    }

}



//Problem 1: isosceles
//
//        For num = 3;
//
//        1, 3, 5
//
//        Add the result of each to some kind of a list so they are in correct order and then print centred:
//        Method 1: Print asterisks for num - 2 until you get to 1;
//        Method 2: Print asterisks for num;
//        Print asterisks for num + 2;
