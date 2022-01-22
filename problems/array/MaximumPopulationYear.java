package com.dsa.problems.array;

import java.util.Arrays;

public class MaximumPopulationYear {

    public int maximumPopulation(int[][] logs) {
        int year = 0;
        int max = Integer.MIN_VALUE;

        Arrays.sort(logs,(a, b) -> Integer.compare(a[0],b[0]));

        for(int i = 0; i < logs.length; i++){
            int count = 1;
            int tempyear = logs[i][0];
            for(int j =  i+1; j < logs.length; j++){
                if(logs[i][1] > logs[j][0]){
                    count++;
                    tempyear = Math.min(logs[i][1]-1,logs[j][0]);
                }
            }
            if(max < count){
                max = count;
                year = tempyear;
            }
        }
        System.out.println(max);
        return year;
    }
}
