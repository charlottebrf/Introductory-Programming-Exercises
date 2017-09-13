import java.lang.reflect.Array;
import java.lang.*;
import java.util.*;

public class primeNumbers {

    public ArrayList<Integer> generate(Integer num) {
        return this.primeNumberGenerator(num);
    }

    public ArrayList<Integer> primeNumberGenerator(Integer num) {
        ArrayList<Integer> result = new ArrayList<Integer>(0);
        Integer temp = 0;


        for (Integer i = 2; i <= num/2; i++) {
            temp = num % i;
            float sum = (float) i / 2;
            double d = (double) i / 2;
            //want to make this generic for a float
            if(temp == 0 && i / 1 == i && i / i == 1 && (i / 2 == 1 || sum == type Float.class)) {
                result.add(i);
            }
        }
        return result;
    }



//
//    public ArrayList<Integer> sortInAscendingOrder(ArrayList<Integer> list) {
//        return Collections.sort(list);
//    }

}
