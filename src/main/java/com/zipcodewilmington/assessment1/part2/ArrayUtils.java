package com.zipcodewilmington.assessment1.part2;

import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter = 0;

        for (int i = 0; i < objectArray.length; i++){
            if (objectArray[i].equals(objectToCount)) {
                counter++;
            }
        }
        return counter;
    }



    /**  NOT WORKING
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Integer> remaining = new ArrayList<Integer>();

        for (int i = 0; i < objectArray.length; i++){
            if (objectArray[i] != objectToRemove){
                remaining.add((Integer) objectArray[i]);
            }
        }
        System.out.println(("Remaining after removed value " + remaining.toString()));
       return null;
    }



    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Arrays.sort(objectArray);
        int counter = 0;
        Object curr = objectArray[0];
        Object maxvalue;
        int maxcounter = -1;
        maxvalue = objectArray[0];

        for (Object each : objectArray){
            if (curr == each){
                counter++;
            } else {
                if (counter > maxcounter){
                    maxcounter = counter;
                    maxvalue = curr;
                }
                counter = 0;
                curr = each;
            }
        }
        if (counter > maxcounter){
            maxvalue = curr;
        }
    return maxvalue;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Arrays.sort(objectArray);
        Object minValue = objectArray[0];
        int minCount = objectArray.length;


            for(int i = 0; i < objectArray.length; i++) {
                int count = 0;
                for(int j = 0; j < objectArray.length; j++) {
                    if(objectArray[j] == objectArray[i]) {
                        count++;
                    }
                }
                if(count < minCount) {
                    minCount = count;
                    minValue = objectArray[i];
                }
            }
            return minValue;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int newLength = (objectArray.length + objectArrayToAdd.length);
        Object[] mergedArray = new Object[newLength];
        int temp = 0;

        for (int i = 0; i < objectArray.length; i++){
            mergedArray[i] = objectArray[i];
            temp = i;
        }

        for (int i = 0; i < objectArrayToAdd.length; i++){
           mergedArray[temp + 1] = objectArrayToAdd[i];
            temp++;
       }
        System.out.println( Arrays.toString(mergedArray) );   //??? HOW DO I GET THIS TO RETURN???
        return mergedArray;
    }
}
