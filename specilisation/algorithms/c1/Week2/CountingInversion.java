import java.io.File;
import java.util.Scanner;

public class CountingInversion {
  public static void main(String[] args) {
    File file = new File("./InversedNumbers.txt");
     int[] arr = new int[100000];
    try{
      Scanner sc = new Scanner(file);
      int i = 0;
      while (sc.hasNextLine()) {
        arr[i] = Integer.parseInt(sc.nextLine());
        i++;
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    
    CountingInversion counting = new CountingInversion();
    long res = counting.count(arr, 0, arr.length -1 );
    System.out.println(res);
    
   
   
  }

  public long count(int[] arr, int l , int r) {
    if (l < r) {
      int mid = l + (r - l) / 2;
      long left = count(arr, l, mid);
      long right = count(arr, mid + 1, r);
      long split =  countSplit(arr, l, r);
    
      return left+right+split;
    }
    return 0;
  }
  
  public int countSplit(int[] arr, int l, int r) {
    int noOfInversion = 0;
    int mid = l + (r - l) / 2;
    int n1 = mid - l + 1;
    int n2 = r - mid;

    int[] leftarr = new int[n1];
    int[] rightarr = new int[n2];

    for(int i = 0; i < n1; i++)
      leftarr[i] = arr[l + i];
      
    for(int i = 0; i < n2; i++)
      rightarr[i] = arr[mid + i + 1];
  
    int i = 0, j = 0, k = l;

    while (i < leftarr.length && j < rightarr.length) {
      if (leftarr[i] > rightarr[j]) {
        arr[k] = rightarr[j++];
        noOfInversion+= leftarr.length - i;
      } else
        arr[k] = leftarr[i++];

        k++;
    }
    while (i < leftarr.length) {
      arr[k++] = leftarr[i++];
      // noOfInversion++;
    }
    while (j < rightarr.length) {
      arr[k++] = rightarr[j++];
    }

    return noOfInversion;
  }
}