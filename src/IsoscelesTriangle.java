import org.apache.commons.lang3.StringUtils;
public class IsoscelesTriangle {

    public String printer(int num) {
        String result = "";
        DrawARightTriangle rightTriangle = new DrawARightTriangle();
        for (int i = 1; i <= num; i++) {
            result += StringUtils.center(rightTriangle.printer(i), 10);
        }
        return result;
    }

}
