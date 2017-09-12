    import org.apache.commons.lang3.StringUtils;

    public class DiamondWithName {
        private String asterisk = "*";

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

        public int addTwo(int num) {
            return num + 2;
        }

        public String asteriskGenerator(int width) {
            String result = "";
            for (int i = 1; i <= width; i++) {
                result += asterisk;
            }
            return this.formatter(result);
        }

        public int checkOdd(int num) {
            int odd = 0;
            if (num % 2 != 0) {
                odd += num;
            }
            return odd;
        }

        public String formatter(String resultString) {
            return StringUtils.center(resultString, 10);
        }


        public String subtractionPrinter(int num) {
            String resultString = "";
            int resultNumber = 0;
            for (int i = 1; i <= num; i++) {
                resultNumber += this.GreaterThanOne(num);
                if (resultNumber == this.checkOdd(resultNumber)) {
                    resultString += this.asteriskGenerator(resultNumber) + "\n";
                    resultString = this.formatter(resultString);
                }
            }
            return this.formatter(resultString);
        }

        public String addsName() {
            String name = "Charlotte\n";
            return name;
        }

        public String upsideDownIsosceles(int num) {
            String resultString = "";
            int one = this.subtractTwo(num);
            resultString += this.asteriskGenerator(num) + "\n";
            resultString += this.asteriskGenerator(one) + "\n";
            return resultString;
        }

        public String rightsideUpIsosceles(int num) {
            String substractedStrings = this.subtractionPrinter(num);
            String addedStrings = this.formatter(addsName());
            return substractedStrings + addedStrings;
        }

        public String printDiamond(int num) {
            String upside = this.upsideDownIsosceles(num);
            String downside = this.rightsideUpIsosceles(num);
            System.out.println(downside + upside);
            return downside + upside;
        }
    }
