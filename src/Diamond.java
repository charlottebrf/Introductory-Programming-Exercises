import org.apache.commons.lang3.StringUtils;

public class Diamond {
    private String asterisk = "*";

    public String getIsosceles(int num) {
        IsoscelesTriangle triangle = new IsoscelesTriangle();
        System.out.println(triangle.Printer(num));
        return triangle.Printer(num);
    }

}