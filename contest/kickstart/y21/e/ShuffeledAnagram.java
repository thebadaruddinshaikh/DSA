package com.dsa.contest.kickstart.y21.e;

import java.util.*;

public class ShuffeledAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        // int no = 1;
        while (tc > 0) {
            String str = sc.nextLine();
            HashMap<Integer, Character> map = new HashMap<>();
            System.out.println(shuffAna(new char[str.length()],str,0,map));
            tc--;
        }
    }

    public static String shuffAna(char[] arr, String org, int pos, HashMap<Integer,Character> map){
        for(int i = 0 ; i < org.length();i++)
            if(!map.containsKey(i) && (org.charAt(pos) != org.charAt(i))) {
                arr[pos] = org.charAt(i);
                pos++;
                map.put(i, org.charAt(i));
            }
        if(pos == 0)
            return "Impossible";
        shuffAna(arr,org,pos,map);

        return String.valueOf(arr);
    }
}
