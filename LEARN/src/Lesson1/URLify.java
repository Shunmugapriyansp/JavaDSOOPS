package Lesson1;

public class URLify {
    public static void main(String[] args){
        String str = "This is a rightway      ";
        System.out.println(str. trim().replace(" ", "%20"));
        System.out.println(replaceSpace( str.toCharArray(), 18));

    }

    static char[] replaceSpace(char[] strArray, int truelength){
        int spaceCount=0,index;
        for (int i=0; i<truelength;i++){
            if(strArray[i]==' ') spaceCount++;
        }
        index=truelength + spaceCount*2;
        if(truelength<strArray.length) strArray[truelength]='\0';
        for(int j= truelength-1; j>=0;j--){
            if(strArray[j]==' '){
                strArray[index-1]='0';
                strArray[index-2]='2';
                strArray[index-3]='%';
                index= index-3;
            }else{
                strArray[index-1] = strArray[j];
                index--;
            }
        }
       return strArray;
    }
}