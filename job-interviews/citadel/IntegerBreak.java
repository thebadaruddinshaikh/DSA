
/**
 * The following question was asked in a Citadel Interview Question
 * Given an Integer n break into the sum of K positive
 * Integer , where k >= 2 and maximize the product of those
 * integer, return the maximum product you get
 * 
 * This question can also be found on LeetCdoe #343
 */

import java.util.*;

 class IntegerBreak{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int len = sc.nextInt();
       int[] arr = new int[len+1];
       IntegerBreak t = new IntegerBreak();
       System.out.println(t.solve(len, arr));
            
      
    }
    public int solve(int len, int[] arr){
        
        if(len <= 1)
        return 1;

        if(arr[len] != 0 )
        return arr[len];

        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= len; i++){
            max =  Math.max(max, i * solve(len - i, arr));
        }
        arr[len] = max;
        return max;
    }

}