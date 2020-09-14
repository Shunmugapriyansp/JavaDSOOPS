package Lesson1;

import java.util.ArrayList;

public class ClsArrayList {
    public static void main(String[] args) {

        String[] a= new String[5];
        String[] b= new String[5];
        a[0]= "test";
        a[1]= "John";
        a[2]= "John2";
        a[3]= "John3";
        a[4]= "John5";
        b[0]= "1test1";
        b[1]= "1John1";
        b[2]= "1John2";
        b[3]= "1John3";
        b[4]= "1John5";

        System.out.println( mergeWords(a,b));

    }
    public static ArrayList<String>  mergeWords(String[] words, String[] more){
        ArrayList<String> sentence = new ArrayList<String>();
        for(String w : words) sentence.add(w);
        for(String m : more) sentence.add(m);
        sentence.add("New boy");
        System.out.println(sentence.size());
        return sentence;
    }
}
