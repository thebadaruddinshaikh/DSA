// package com.dsa.specilisation.c1;

import java.util.*;

public class RecurMulti {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        int[] a = {3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3,2,3,8,4,6,2,6,4,3,3,8,3,2,7,9,5,0,2,8,8,4,1,9,7,1,6,9,3,9,9,3,7,5,1,0,5,8,2,0,9,7,4,9,4,4,5,9,2};
        int[] b = {2,7,1,8,2,8,1,8,2,8,4,5,9,0,4,5,2,3,5,3,6,0,2,8,7,4,7,1,3,5,2,6,6,2,4,9,7,7,5,7,2,4,7,0,9,3,6,9,9,9,5,9,5,7,4,9,6,6,9,6,7,6,2,7};
        
        RecurMulti multi = new RecurMulti();
        int[] res = multi.multipy(a, b);

        for(int x: res)
            System.out.print(x);

    }

    public int[] multipy(int[] a, int[] b) {
        if (a.length == 1) {
            int prod = a[0] * b[0];
            return (prod < 10) ? new int[] { prod } : new int[] { prod / 10, prod % 10 };
        }
        

        return addArrays(
                multiplyWithTen(
                        multipy(
                                Arrays.copyOfRange(a, 0, a.length / 2),
                                Arrays.copyOfRange(b, 0,
                                        b.length/2)
                        ), a.length),
                                
                multiplyWithTen(
                    addArrays(
                        multipy(
                                Arrays.copyOfRange(a, 0, a.length / 2),
                                Arrays.copyOfRange(b, b.length / 2,
                                        b.length)
                                ),
                        multipy(
                                Arrays.copyOfRange(a, a.length / 2, a.length),
                                Arrays.copyOfRange(b, 0,
                                b.length / 2)
                                ),
                                new int[] {}
                                ), a.length/2),
                multipy(
                            Arrays.copyOfRange(a, a.length / 2, a.length),
                            Arrays.copyOfRange(b, b.length / 2, b.length)
                        )
        
        
                );

    
    }

    public int[] multiplyWithTen(int[] arr, int powerOfTen) {
        int[] ans = new int[arr.length + powerOfTen];
        ans = Arrays.copyOf(arr, ans.length);
        return ans;
    }

    public static int[] addArrays(int[] a, int[] b, int[] c) {
        Stack<Integer> stack = new Stack();
        int carry = 0;
        int i = a.length-1;
        int j = b.length-1;
        int k = c.length-1;
        while(i >= 0 || j >= 0 || k>=0) {
            int x = (i >= 0) ? a[i] : 0;
            int y = (j >= 0) ? b[j] : 0;
            int z = (k >= 0) ? c[k] : 0;

            int sum = x + y + z + carry;
            carry = sum / 10;
            stack.push(sum%10);
            i--;j--;k--;
        }
        if(carry > 0)
        stack.push(carry);

        int x = 0;
        int[] res = new int[stack.size()];
        while (stack.size() != 0) {
            res[x] = stack.pop();
            x++;
        }
        return res;
    }
}
