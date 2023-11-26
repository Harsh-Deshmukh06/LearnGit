package com.company;
import java.util.*;

public class array2D_Problems {
    public static void main(String[] args) {
        int[][] arr=new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // arr=transposeMatrix(arr,3,3);
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

        // transposeInPlace(arr,3,3);

        rotateArray(arr,3);
    }

    static int[][] transposeMatrix(int[][] arr,int r,int c) {
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j=0; j<r; j++) {
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }
//only for square matrices
    static void transposeInPlace(int[][] matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        printArray(matrix);

    }

    static void printArray(int[][]arr){
        int r=arr.length;
        for(int i=0;i<r;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
//square matrix is given
    static void rotateArray(int[][] arr,int n){
        //transpose
        //reverse each row of transposed matrix
        transposeInPlace(arr,n,n);
        for(int i=0;i<n;i++){
            reverseArray(arr[i]);
        }
        printArray(arr);
    }

    static void reverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start+=1;
            end-=1;
        }
    }
}
