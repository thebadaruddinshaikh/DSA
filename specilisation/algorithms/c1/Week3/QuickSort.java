package com.dsa.specilisation.algorithms.c1.Week3;
public class  QuickSort {
  public static void main(String[] args) {
    int[] arr = { 6,9,2, 8, 5, 11, 7,3};
    QuickSort qs = new QuickSort();

    qs.partition(arr, 0);
    
    qs.printArray(arr);
   
  }

  public void partition(int[] arr, int pivot) {
    int i = 1;

    for (int j = i; j < arr.length; j++) {
      if (arr[j] < arr[pivot]) {
        int temp = arr[i];
        arr[i++] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[--i];
    arr[i] = arr[pivot];
    arr[pivot] = temp;
  }
  
  public void printArray(int[] arr) {
    for(int a: arr){
      System.out.print(a);
    }
      System.out.println();
  }
}