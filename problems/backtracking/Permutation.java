// package com.dsa.problems.backtracking;
/***
 * Give a String find all possible numbers with
 * a. No duplications
 * b. With duplications
 */


/***
 * Problems
 * 1. Object that are store on the heap reverse to the original form after backtracking
 */
import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        HashSet set = new HashSet<String>();
        Permutation permu = new Permutation();
        String str = "abc";
        int l = 0, r = str.length() - 1;
        permu.perm(str, l, r, set);
        
        set.forEach((per)-> System.out.println(per));
    }

    public void perm(String str, int left, int right, HashSet<String> set) {
        if (left < right) {
            for (int i = right; i >= 0; i--) {
                String str1 = swap(str, left, i);
                if (!set.contains(str1))
                    set.add(str1);
                perm(str1, left + 1, right, set);
            }
        }
    }

    public String swap(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }
}






