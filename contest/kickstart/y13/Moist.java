package com.dsa.contest.kickstart.y13;
/***
 * Accepted
 */

import java.util.*;

public class Moist {
    public static void main(String[] args) {
        ArrayList<String> deck = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            int len = sc.nextInt();
            for (int j = 0; j <= len; j++) {
                deck.add(sc.nextLine());
            }
            String[] deck_array = new String[deck.size()];
            deck_array = deck.toArray(deck_array);
            System.out.println("Case #" + (i + 1) + ": " + calculator(deck_array));
            deck.clear();
        }
    }

    public static int calculator(String[] deck) {
        int price = 0;
        boolean charge = false;
        for (int i = 1; i < deck.length; i++) {
            charge = false;
            int j = i - 1;
            String key = deck[i];
            while (j > 0 && (key.compareTo(deck[j]) < 0)) {
                charge = true;
                deck[j + 1] = deck[j];
                j -= 1;
            }
            deck[j + 1] = key;
            if (charge == true)
                price += 1;

        }
        return price;
    }
}