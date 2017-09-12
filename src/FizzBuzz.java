public class FizzBuzz {

    public String fizzOrBuzz(int num) {
        String fizzingOrBuzzing = "";

        if (num % 5 == 0 && num % 3 == 0) {
            fizzingOrBuzzing += "FizzBuzz" + "\n";
        } else if (num % 5 == 0 && num % 3 != 0) {
            fizzingOrBuzzing += "Buzz" + "\n";
        } else if (num % 3 == 0 && num % 5 != 0) {
            fizzingOrBuzzing += "Fizz" + "\n";
        } else if (num >= 1 ) {
            fizzingOrBuzzing += num + "\n";
        }
        return fizzingOrBuzzing;
    }

    public String printer(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            result += fizzOrBuzz(i);
        }
        return result;
    }
}
