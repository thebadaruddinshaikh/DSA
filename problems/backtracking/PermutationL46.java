import java.util.*;
/*
This Question is from LeetCode 46

Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

*/
public class PermutationL46 {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    permutation(nums, 0, ans);
    return ans;
    
}
public void permutation(int[] arr, int pos, List<List<Integer>> ans){
    if(pos == arr.length-1){
        addAnswer(ans, arr);
    }
    for(int i = pos; i < arr.length; i++){
        swap(arr, pos, i);
        permutation(arr, pos+1,ans);
        swap(arr,pos,i);
    }
}
public void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
public void addAnswer(List<List<Integer>> ans, int[] arr){
    List<Integer> ans1 = new ArrayList<>();
    for(int a: arr)
        ans1.add(a);
    ans.add(ans1);
}
}
