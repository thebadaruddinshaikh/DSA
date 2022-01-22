package com.dsa.specilisation.c1;

import java.util.*;
public class PrimiMul{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number (num1) : ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second Number (num2): ");
        String str2 = sc.nextLine();


        int[] num1 = new int[str1.length()];
        int[] num2 = new int[str2.length()];

        for(int i = 0 ; i < str1.length(); i++)
            num1[i] = Character.getNumericValue(str1.charAt(i));

        for(int i = 0 ; i < str1.length(); i++)
            num2[i] = Character.getNumericValue(str2.charAt(i));

        int[] ans = multiply(num1,num2);

        int i = 0;
        while(ans[i] == 0)
            i++;

        for(; i < ans.length;i++)
            System.out.print(ans[i]);

        System.out.println();

    }
    public static int[] add(int[] arr1, int[] arr2){
        int n = Math.max(arr1.length, arr2.length) + 1;
        int[] ans = new int[n];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = ans.length -1;
        int carry = 0;
        while(k>=0){
            int a = i >= 0? arr1[i]:0;
            int b = j >= 0? arr2[j]:0;
            int res = a+b+carry;
            ans[k] = res%10;
            carry = res/10;
            i--;
            j--;
            k--;
        }
        return ans;
    }

    public static int[] multiply(int[] num1,int[] num2){
        int[] ans = new int[num1.length + num2.length];
        for(int i = 0; i < num2.length;i++){
            int[] temp = new int[num1.length + num2.length];

            int len = num2.length - 1;
            int j = num1.length - 1;
            int k = temp.length - 1;

            int carry = 0;

            while(j >= 0){
                int res = num1[j] * num2[len - i] + carry;
                temp[k - i] = res%10;
                carry = res/10;
                j--;k--;
            }
            temp[k-i] = carry;
            ans = add(ans,temp);
        }
        return ans;
    }
}