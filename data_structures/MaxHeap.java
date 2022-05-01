public class MaxHeap {
    int[] arr;

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();
        heap.arr = new int[]{7, 5, 1, 9, 3, 5, 9, 8, 6, 2, 4};

        heap.buildMaxHeap();

        for (int a : heap.arr)
            System.out.print(a + " ");

        heap.poll();
        System.out.println("\nAfter polling");
        for (int a : heap.arr)
            System.out.print(a + " ");

        heap.add(6);
        System.out.println("\nAfter Adding");
        for (int a : heap.arr)
            System.out.print(a + " ");


    }

    //maintain Heap Invariant
    public void maxHeapify(int a) {
        int size = this.arr.length;
        int largest = a;
        int l = (a * 2) + 1;
        int r = (a * 2) + 2;


        if (l < size && this.arr[l] > this.arr[a])
            largest = l;
        if (r < size && this.arr[r] > this.arr[largest])
            largest = r;

        if (largest != a) {
            int temp = this.arr[a];
            this.arr[a] = this.arr[largest];
            this.arr[largest] = temp;
            maxHeapify(largest);
        }
    }

    //build MaxHeap
    public void buildMaxHeap() {
        for (int i = this.arr.length / 2; i >= 0; i--) {
            maxHeapify(i);
        }
    }

    //poll
    public int poll() {
        int root = this.arr[0];
        this.arr[0] = this.arr[this.arr.length - 1];
        this.arr[this.arr.length - 1] = root;
        maxHeapify(0);
        return root;


    }

    //peak
    public int peak() {
        return this.arr[0];
    }

    //add
    public void add(int val) {
        int index = this.arr.length - 1;
        this.arr[index] = val;
        while (index > -1 && val > this.arr[getParent(index)]) {
            int temp = this.arr[getParent(index)];
            this.arr[getParent(index)] = val;
            this.arr[index] = temp;
        }
    }

    public int getParent(int a) {
        return (a - 1) / 2;
    }
}
