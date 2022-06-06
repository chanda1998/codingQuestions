package com.firstprograms;

public class setzero {

    public static void setZeros(int matrix[][]) {
        int r = matrix.length;
        int c = matrix[0].length;
        int zeroByColumn = 0;
        int zeroByRow = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(matrix[i][j]==0){
                    if(i==0) {
                        zeroByColumn++;
                    }else if(j==0){
                        zeroByRow++;
                    }
                    if(i!=0 && j!=0){
                        matrix[0][j]=0; matrix[i][0]=0;
                    }
                }
            }
        }
        for(int i = r-1; i >= 0; i--) {
            for (int j = c-1; j >= 0; j--) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
                if(i==0&&zeroByColumn>0){
                    matrix[i][j] = 0;
                }
                if(j==0&& zeroByRow>0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(zeroByColumn>0||zeroByRow>0){
            matrix[0][0] = 0;
        }
    }
}
