package Lesson1;

import java.util.Arrays;

public class IsPermutationofPalindrome {
    public static void main(String[] args) {
        int [] table1= buidCharFreqTable("Tests");
        System.out.println(Arrays.toString(table1));
        System.out.println(CheckMaxOneOdd(table1));
    }
    //return the int value for characters ignoring the case
    static int getCharNumber(Character c){
        int a= Character.getNumericValue('a');
        int z= Character.getNumericValue('z');
        int val= Character.getNumericValue(c);
        if(a<=val&& z>=val){
            return val - a;
        }
        return -1;
    }

    // This builds a Character array with a at 0th index till z= 25th index
    static int[] buidCharFreqTable(String phrase){
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a')+1];
        for(char c : phrase.toCharArray()){
            int x  = getCharNumber(c);
            if(x!=-1)
                table[x]++;
        }
        return table;
    }

//return false if there is a possibility of palindrome 1.e if more than 2 odd count chracters
    static boolean CheckMaxOneOdd(int[] table){
        boolean foundoddOne= false;
        for (int count: table){
            if(count%2==1){
                if(foundoddOne){
                    return false;
                }
                foundoddOne= true;
            }
        }return  true;
    }
}