package com.dsa.problems.array;

import java.util.*;

public class NegativePositiveAlternate {
    public static void main(String[] args){
        int[] arr = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0};
        int i = 0, j =0;
        while(i < arr.length){
            j = i;

            if(i%2 == 0 && arr[i] > 0){
                for(;j<arr.length;j++)
                    if(arr[j] < 0)
                        break;
            }
            if(i%2 != 0 && arr[i] < 0){
                for(;j<arr.length;j++)
                    if(arr[j] > 0)
                        break;
            }
            if(j != arr.length && j != i) {
                int key = arr[j];
                while (j != i) {
                    arr[j] = arr[j-1];
                    j--;
                }
                arr[j] = key;
            }
            i++;
        }

        for(int a : arr)
            System.out.println(a);
    }



}
