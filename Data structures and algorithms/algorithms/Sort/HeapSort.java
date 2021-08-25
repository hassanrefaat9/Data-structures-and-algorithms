
package Algorthims;

public class HeapSort {
        public void sort(int arr[])
    {
        int n = arr.length;
 
        // Build heap to arrange array
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            heapify(arr, i, 0);
        }
    }
      void heapify(int arr[], int n, int i)//n=size i=postion
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left chaild = 2*i + 1
        int r = 2 * i + 2; // right chaild= 2*i + 2
 
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        //well do swap
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }
          public static void main(String args[])
    {
        int arr[] = { 56, 45, 5, 2, 55, 43};
        int n = arr.length;
        System.out.println("Befoer Sort");
        for(int z : arr)
        System.out.print(z +"\t");
        HeapSort ob = new HeapSort();
        ob.sort(arr);
      
        System.out.println("\nAfter sort ");
        for(int x :arr)
            System.out.print(x+"\t");
    }

}
