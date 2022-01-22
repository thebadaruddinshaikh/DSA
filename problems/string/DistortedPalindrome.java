package com.dsa.problems.string;

import java.awt.*;
import java.util.*;
public class DistortedPalindrome {
    public static void main(String[] args){
        String str = "asflkj";
        DistortedPalindrome dist =  new DistortedPalindrome();
        System.out.println(dist.solution(str));
    }
    public String solution(String str){
        HashSet<Character> set = new HashSet<>();

        for(int i = 0 ; i < str.length();i++){
            set.add(str.charAt(i));
        }
        if(str.length() % 2 == 0 && (set.size()*2 != str.length()))
            return "Impossible";

        if(str.length() % 2 != 0 && (set.size() * 2 != str.length() + 1))
            return "Impossible";


        //swap logic
        
        return "Kuch nai";
    }
}
