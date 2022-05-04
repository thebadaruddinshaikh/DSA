import java.util.*;
public class GroupMovies {
    public static void main(String[] args){
        int[] arr = { 1, 5, 4, 6, 8, 9, 2 };
        int diff = 3;
        System.out.println(groups(arr, diff));
    }
    public static int groups(int[] arr, int diff){
        Arrays.sort(arr);
        int curr = arr[0];
        int group = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - curr >= diff) {
                curr = arr[i];
                group++;
            }
        }
        return (arr[arr.length -1] != curr) ? ++group : group;
    }
}
