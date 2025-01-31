package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < ints.length-1; i++){
            if (ints[i] %2 !=0) {
                list.add(ints[i]);
            }
        }
        Integer[] answer = new Integer[list.size()];
        return list.toArray(answer);
    }


    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < ints.length; i++) {
            if(ints[i] % 2 == 0)
            {
                list.add(ints[i]);
            }
        }
        Integer[] answer = new Integer[list.size()];
        return list.toArray(answer);
 }


    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < ints.length; i++){
            if (ints[i] %3 != 0) {
                list.add(ints[i]);
            }
        }
        Integer[] answer = new Integer[list.size()];
        return list.toArray(answer);
    }


    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        List<Integer> multipleN = new ArrayList<Integer>();
        for(int i = 0; i < ints.length; i++) {
            if(ints[i] % multiple != 0)
            {
                multipleN.add(ints[i]);
            }
        }
        Integer[] answer = new Integer[multipleN.size()];
        return multipleN.toArray(answer);
    }

}
