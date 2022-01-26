public class ArraySum{
    public static void main(String[] args){
        int[] arr1 = {22,7,1,-5,5,-2};
        int[] arr2 = {4,-1,21,12,10,-3};
        ArraySum ar = new ArraySum();
        System.out.println(ar.SumOfPro(arr1,arr2, arr1.length));
    }

    public int SumOfPro(int[] arr1, int[] arr2, int n){
        if(n<=0)
        return -1;
        int m = n-1;
        int prod = 0;
        for(int i = 0 ; i <= m; i++){
            prod += arr1[i]*arr2[m-i];
        }
        return prod;
    }
}