// package com.dsa.sorting;

public class Insertion {
  public static void main(String[] args) {
    int[] arr = { 6, 2, 8, 9, 3, 4, 0, 6, 1, 5, 7 };
    Insertion insertion = new Insertion();

    insertion.sort(arr);

    for (int i : arr)
      System.out.print(i);

  }
  
  public void sort(int[] arr) {
    
    for (int j = 0; j < arr.length; j++) {
      int key = arr[j];
      int i = j - 1;

      while (i > -1 && key < arr[i]) {
        arr[i + 1] = arr[i];
        i--;
      }
      arr[i + 1] = key;
    }
  }
}
