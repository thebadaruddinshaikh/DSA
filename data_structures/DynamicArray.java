package com.dsa.data_structures;

public class DynamicArray {

    private int[] arr;
    private int length;
    private int capacity;

    public DynamicArray(int capacity) {
        if(capacity < 0) throw new IllegalArgumentException("Illegal Capacity "+ capacity);
        this.capacity = capacity;
        arr = new int[capacity];
    }

    //size
    public int size(){
        return this.length;
    }

    //get at index
    public int get(int index){
        return arr[index];
    }

    //clear
    public void clear(){
        for (int i = 0 ; i < length; i++) {
            arr[i] = 0;
            length = 0;
        }
    }

    //add
    public void add(int elem){
        if(length + 1 >= capacity) {
            if(capacity == 0) capacity = 1;
            else capacity *=2;
            int[] newarr = new int[capacity];
            for(int i = 0; i < length; i++) {
                newarr[i] = arr[i];
            }
            arr = newarr;
        } else {
            arr[length++] = elem;
        }
    }

    //remove at
    public int removeAt(int rm_index){
        if(rm_index < 0 || rm_index >= length) throw new IndexOutOfBoundsException();
        int data = arr[rm_index];
        int[] newarr = new int[--length];
        for(int i = 0, j = 0; i < length ; i++, j++) {
            if (i == rm_index) j--;
            else newarr[j] = arr[i];
        }
        arr = newarr;
        return data;
    }


    //remove
    public boolean remove(int val){
        int index = indexOf(val);
        if(index == -1) return false;
        removeAt(index);
        return true;
    }


    //indexOf
    public int indexOf(int val) {
        for(int i = 0 ; i < length ; i++){
            if(arr[i] == val)
                return i;
        }
        return -1;
    }

    //contains
    public boolean contains(int val){
      return indexOf(val) == -1;
    }
}
