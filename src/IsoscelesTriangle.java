import org.apache.commons.lang3.StringUtils;
public class IsoscelesTriangle {

    public String printer(int num) {
        String result = "";
        DrawARightTriangle rightTriangle = new DrawARightTriangle();
        for (int i = 1; i <= num; i++) {
            result += rightTriangle.printer(i);
        }
        return StringUtils.center(result, 10);
    }

}
