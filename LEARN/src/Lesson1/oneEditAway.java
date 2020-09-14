package Lesson1;

public class oneEditAway {
    public static void main(String[] args) {
        //Pale, ple = true
        //pales, pale = true
        //Pale, bale = true
        //Pale, bae = false
        System.out.println(isOneEditAway("Pale", "Ple"));

    }
    static boolean isOneEditAway(String a, String b){
        if(a.length() == b.length()){
            return oneEditReplace(a,b);
        }else if(a.length()+1==b.length()){
            return oneEditInsert(a,b);
        }else if(a.length()-1==b.length()){
            return oneEditInsert(b,a);
        }else return false;
    }

   static boolean oneEditReplace(String a, String b){
        int editcount=0;
        for (int i= 0; i<=a.length()-1;i++){
            if(!(a.charAt(i)==b.charAt(i))){
               if(editcount==1){
                   return false;
               }
                editcount ++;
            }
        }
        return true;
    }
   static boolean oneEditInsert(String a, String b){
        int editcount=0;
        for (int i= 0; i<=a.length()-1;i++){
            if(!(a.charAt(i)==b.charAt(i+ editcount))){
                if(editcount==1){
                    return false;
                }
                editcount ++;
                i--;
            }
        }
        return true;
    }

}
