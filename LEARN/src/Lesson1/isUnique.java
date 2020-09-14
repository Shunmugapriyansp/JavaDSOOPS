package Lesson1;

import java.util.HashSet;
import java.util.Set;



public class isUnique {
    public static void main(String[] args) {
        System.out.println(isUniqueChr1 ("Super"));
        //System.out.println(isUniqueChr1 (""));
    }

    static boolean isUniqueChr(String s){
        if(s.length()>128) return  false;
        boolean[] char_set = new boolean[128];
        for(int i=0;i<s.length(); i++){
            int val;
            val = s.charAt(i);//returns an ascii
            System.out.println(val);
            if(char_set[val]){
                return false;
            }
                char_set[val]= true;
        }
        return true;
    }
    static boolean isUniqueChr1(String s){
        if(s.length()>128) return  false;
        int checker = 0;
        for(int i=0;i<s.length(); i++){
            int val;
            val = s.charAt(i)-'a';//returns an ascii
            System.out.println(val);
          if((checker & (1<<val))>0){//this is a bitwise and which means checker = 0 (binary)  shifting 1 for  the same location of alphabet in the order of a as 1 b as 2
              //only  Checker and the 1<<val becomes 1 when  1 matches the same location in checker and Val
              //if 100 and 1<<2
              //100 and 100 = 100
              //if 100 and 1<<1
              //100 and 10 = 000
              //if 100 and 1<<3 = 100 and 1000= 0000 (This is simillar to multiplication)
                return false;
            }

            checker|= (1<<val);
          //assigning the value to checker with Bitwise operator
          //assigning the value to checker with Bitwise operator
            // checker |= 1<<2
            //checker = 0 | 10 = 10
            //checker|=1<<2
            //checker = 10|10 = 10
            //checker |=1<<3
            //Checker = 10 |100 = 110 (Simillar to addition)
            System.out.println(checker);
        }
        return true;
    }
    static boolean isUniqueChr2(String s){
        Set<Character> Cset= new HashSet<>();
        for (char c: s.toCharArray()){
            if(Cset.contains(c)){
                return false;
            }
            Cset.add(c);
        }return  true;

    }
}
