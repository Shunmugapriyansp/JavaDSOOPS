package Lesson1;


import java.util.Arrays;

public class CheckPermutation {
    public static void main(String[] args) {
        System.out.println(checkPermut("raja", "ajar"));
    }

    static boolean checkPermut(String str1, String str2) {
        if (str1.length() == str1.length())
            return Arrays.equals(StrtoAscArraywithCnt(str1), StrtoAscArraywithCnt(str2));
        return false;
    }

    static int[] StrtoAscArraywithCnt(String str) {
        //return null;
        int[] Ascarray = new int[128];
        for (int i = 0; i < str.length(); i++) {
            Ascarray[str.charAt(i)]++;
            //System.out.println(str.charAt(i));
            //System.out.println(Ascarray[str.charAt(i)]);
        }
        System.out.println(Ascarray);
        return Ascarray;
    }
}
