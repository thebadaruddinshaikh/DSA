import java.util.*;
class Anagram{
    public static void main(String[] args){
        String input1 = "build";
        String input2 = "uildb";
        Anagram ana = new Anagram();
        System.out.println(ana.anagramCheck(input1, input2));
        


    }
    public String anagramCheck(String input1, String input2){
        if(input1.length() != input2.length())
        return "no";

        char[] arr1 = input1.toCharArray();
        char[] arr2 = input2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0 ; i  < arr1.length; i++){
            if(arr1[i] != arr2[i])
            return "no";
        }
        return "yes";
    }
}