package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer count = 0;
        String reversed = "";
        int start = 0;
        int end = input.length()-1;

 //      while (start < input.length/2){

 //       for (start; end; )
            //create reverse
            String reverse = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed = reversed + input.charAt(i);
            }
            //compare
            if (input == reversed) {
                count++;
            }

 //       }
        return count;
    }
}
