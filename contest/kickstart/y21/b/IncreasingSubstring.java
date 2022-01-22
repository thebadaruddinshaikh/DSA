package com.dsa.contest.kickstart.y21.b;

import java.util.*;

public class IncreasingSubstring {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int tc = Integer.parseInt(sc.nextLine());
            while(tc>0){
                int len = Integer.parseInt(sc.nextLine());
                String str = sc.nextLine();
                StringBuilder sb = new StringBuilder();
                for(int i = 0 ; i < len; i++){
                    if(str.charAt(i) < 65 || str.charAt(i) > 91){
                        //handle the edge case
                    }
                    int inclen = 1;
                    int j = i;
                    while(j > 0){
                        if(str.charAt(j-1) < str.charAt(j))
                            inclen++;
                        else break;
                        j--;
                    }
                    sb.append(inclen+" ");
                }
                System.out.println(sb);
                tc--;
            }
        }

}
