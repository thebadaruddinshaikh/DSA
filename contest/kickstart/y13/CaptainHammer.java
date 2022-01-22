package com.dsa.contest.kickstart.y13;
/***
 * WA
 */

import java.util.Scanner;

public class CaptainHammer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        int curr = 1;
        while(curr<= tc){
            //code here
            int v = sc.nextInt();
            int d = sc.nextInt();
            System.out.printf("Case #%d: %.7f\n",curr,cal(v,d));
            curr++;
        }
    }
    public static double cal(int v, int d){
        double pi = Math.PI;
        return (180*0.5*(Math.asin((d*9.8)/(v*v))))/pi;

    }
}
