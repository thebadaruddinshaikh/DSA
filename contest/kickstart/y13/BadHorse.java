package com.dsa.contest.kickstart.y13;


import java.util.*;

public class BadHorse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        int cs = 1;
        while(cs <= tc) {
            HashMap<String, HashSet<String>> enemity = new HashMap<>();

            HashSet<String> A = new HashSet<>();
            HashSet<String> B = new HashSet<>();

            int pair = Integer.parseInt(sc.nextLine());
            while (pair > 0) {
                String p1 = sc.next();
                String p2 = sc.next();
                sc.nextLine();
                if (!enemity.containsKey(p1))
                    enemity.put(p1, new HashSet<>());

                enemity.get(p1).add(p2);

                if (!enemity.containsKey(p2))
                    enemity.put(p2, new HashSet<>());

                enemity.get(p2).add(p1);

                if (A.contains(p1) || B.contains(p1)) {
                    HashSet<String> enem = enemity.get(p2);
                    if (A.contains(p1)) {
                        for (String s : enem) {
                            if (B.contains(s)) {
                                System.out.println("Case #" + cs + ": " + "No");
                                break;
                            }

                            B.add(p2);
                        }
                    } else {
                        for (String s : enem) {
                            if (A.contains(s)) {
                                System.out.println("Case #" + cs + ": " + "No");
                                break;
                            }

                        }
                        A.add(p2);
                    }
                } else if (A.contains(p2) || B.contains(p2)) {
                    HashSet<String> enem = enemity.get(p1);
                    if (A.contains(p2)) {
                        for (String s : enem) {
                            if (B.contains(s)) {
                                System.out.println("Case #" + cs + ": " + "No");
                                break;
                            }
                        }
                        B.add(p1);
                    } else {
                        for (String s : enem) {
                            if (A.contains(s)) {
                                System.out.println("Case #" + cs + ": " + "No");
                                break;
                            }

                        }
                        A.add(p1);
                    }
                } else {
                    A.add(p1);
                    B.add(p2);
                }
                pair--;
            }
            System.out.println("Case #" + cs + ": " + "Yes");

            cs++;
        }
    }
}
