import java.lang.reflect.Array;
import java.util.*;

public class primeNumbers {

    public ArrayList<Integer> generate(Integer num) {
        ArrayList<Integer> list = new ArrayList<Integer>(0);
        return this.isOneOrSelf(list, num);
    }

    public ArrayList<Integer> isOneOrSelf(ArrayList<Integer> list, Integer num) {
        ArrayList<Integer> numList = new ArrayList<Integer>(num);
        if (list == numList || num == 1) {
            return list;
        }
        return list;
    }


    //must be a positive integer greater than 1


    //when a prime number is divided by another positive integer, the result will only be a positive integer when the prime number is divided by itself & the number 1

//    IS NOT PRIME
//    4 % 2 = 2 - still positive
//    6 / 3 = 2
//            6 / 2 = 3 ;
//    not prime numbers
//
//    IS PRIME: only divided by self & number 1 to produce positive integers
//    2 / 2 = 1
//    2 / 1 = 2


//    3 / 3 = 1;
//    3 / 1 = 3;


//    Can't be itself or 1


//    find prime numbers for that number from 1 to number; e.g. up to 30 in the case of 30
}
