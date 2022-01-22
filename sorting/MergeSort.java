package com.dsa.sorting;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,1,7,9,5,0};
        MergeSort ms = new MergeSort();
        ms.sort(arr, 0 , arr.length - 1);

        for(int a : arr)
            System.out.print(a+ " ");
        System.out.println();
        
    }

    public void sort(int [] arr, int l, int r){
        if(l == r)
            return;
        int mid = l + (r-l)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr, l, mid,r);
    }
    public void merge(int[] arr, int l, int mid, int r){
        int[] left = new int[mid - l + 1];
        int[] right = new int[r - mid];

        for(int i = 0; i < left.length; i++)
            left[i] = arr[l + i];

        for(int i = 0; i < right.length; i++)
            right[i] = arr[mid + i + 1];

        int i = 0, j = 0,  k = l;
        while( i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    //
}
