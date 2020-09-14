package Lesson1;

import java.util.Arrays;

public class RotateMatrix {

    public static void main(String[] args) {
     int[][] test= new int[5][5];
        test[0][1]= 1;
        test[0][2]= 2;
        test[0][3]= 3;
        test[0][4]= 4;
        test[0][0]= 0;

        test[1][0]= 10;
        test[1][1]= 11;
        test[1][2]= 12;
        test[1][3]= 13;
        test[1][4]= 14;

        test[2][0]= 20;
        test[2][1]= 21;
        test[2][2]= 22;
        test[2][3]= 23;
        test[2][4]= 24;

        test[3][0]= 30;
        test[3][1]= 31;
        test[3][2]= 32;
        test[3][3]= 33;
        test[3][4]= 34;

        test[4][0]= 40;
        test[4][1]= 41;
        test[4][2]= 42;
        test[4][3]= 43;
        test[4][4]= 44;

        //4  1  2  3
        //14 11 12 13
        //24 21 22 23
        //34 31 32 33
        printArray(test);
        rotateMatrix(test);
    }

    static boolean rotateMatrix(int[][] Matrix){
        if(Matrix.length == 0 || Matrix.length!=Matrix[0].length)return  false;
        int n= Matrix.length;
        for (int i= 0;i<n/2;i++ ){
            int first = i;
            int last= n-1-i;
            for (int j = first; j<last; j++){
                int top=Matrix[first][j] ;
                Matrix[first][j]=Matrix[last-j][first];
                Matrix[last-j][first]=Matrix[last][last-j];
                Matrix[last][last-j]=Matrix[j][last];
                Matrix[j][last] = top;
            }
        }
        printArray(Matrix);
        return  Boolean.TRUE;
    }

    static void printArray(int[][] Matrix){

        for (int i =0; i<Matrix.length; i++){
            for(int j=0; j< Matrix[0].length; j++){
                System.out.print(Matrix[i][j] + "  " );
            }
            System.out.println();
        }
    }

}
