import java.util.HashSet;
import java.util.Set;

public class primeNumbers {

    public Set<Integer> primeNumberGenerator(Integer num) {
        Set<Integer> primeFactors = new HashSet<Integer>();

        for (Integer i = 2; i <= num; i++) {
            while(num % i == 0) {
                primeFactors.add(i);
                num /= i;
            }
        }
        return primeFactors;
    }
}

