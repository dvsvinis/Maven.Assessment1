package com.zipcodewilmington.assessment1.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     * The way this question reads I think it should be 0+1+2+3+4 = 10 (not including 5)
     * but that doesn't pass the test
     */
    public static Integer getSumOfN(Integer n) {
        Integer sumOfN = 0;
        for (int i = 1; i <= n; i++) {
            sumOfN = sumOfN + i;
        }
        return sumOfN;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer productOfN = 1;
        for (int i = 1; i <= n; i++) {
            productOfN = productOfN * i;
        }
        return productOfN;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String str = val.toString();
        String reverse = "";
        for(int i = str. length() - 1; i >= 0; i--) {
            reverse = reverse + str. charAt(i); }
        return Integer.valueOf(reverse);
    }
}
