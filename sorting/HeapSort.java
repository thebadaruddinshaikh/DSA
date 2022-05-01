package com.dsa.sorting;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 1, 9, 3, 5, 9, 8, 6, 2, 4 };
        HeapSort heap = new HeapSort();
        heap.buildMaxHeap(arr);

        heap.sort(arr);

        for(int a: arr)
            System.out.println(a);
    }
    
    public void maxHeapify(int[] arr, int a, int heapSize) {
        int largest = a;
        int l = a * 2 + 1;
        int r = a * 2 + 2;

        if(l <= heapSize  && arr[l] > arr[a])
            largest = l;
        if(r <= heapSize && arr[r] > arr[largest])
            largest = r;
        
        if (largest != a) {
            int temp = arr[a];
            arr[a] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, largest, heapSize);
        }
    }
    
    public void buildMaxHeap(int[] arr) {
        for (int i = arr.length/ 2 + 1; i >= 0; i--)
            maxHeapify(arr, i, arr.length - 1);
    }
    
    public void sort(int[] arr) {
        int heapSize = arr.length - 1;
        for (int i = arr.length - 1; i >= 2; i--) {
            int temp = arr[0];
            arr[0] = arr[heapSize];
            arr[heapSize] = temp;
            heapSize--;
            maxHeapify(arr, 0, heapSize);
            
        }
    }
}
