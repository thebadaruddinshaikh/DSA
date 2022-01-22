package com.dsa.problems.string;

import java.util.*;

public class SmallestPalindrome {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        String str = sc.next();
        int number_operations = sc.nextInt();

        int[] operations = new int[number_operations];

    }

    public String palindrome(int l , int r, String str){
        int len = r-l+1;
        char[] ans = new char[str.length()];
        char[] chararr = str.toCharArray();

        Arrays.sort(chararr);

        HashSet<Character> set = new HashSet<Character>();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        //checking if palindrome possible
        for(int i = l ; i <= r; i++){
            char letter = str.charAt(i);

            if(map.containsKey(letter))
                map.put(letter, map.get(letter)+1);
            else map.put(letter, 1);

            if(!set.remove(letter))
                set.add(letter);
        }

        if(len%2 == 0){
            if(set.size() != 0)
                return "No";
        }
        else if(set.size() != 1)
            return "No";

        //creating palindrome


        return "working";
    }
}
