package com.Sort;

public class MergeSort {
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two sub arrays to be merged
        int n1 = m - l + 1; //lift sub array
        int n2 = r - m;     //right sub array
 
       //Create sub arrays 
        int liftSubArr[] = new int[n1];
        int rightSubArr[] = new int[n2];
 
        //Copy the elements to  sub arrays
        for (int i = 0; i < n1; ++i)
        	liftSubArr[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
        	rightSubArr[j] = arr[m + 1 + j];
 
    
        // Merge 
       
        int i = 0,//first sub array
        j = 0;    //second sub array
 
        
        int k = l;//index of large  array that merge tow sub array
        
        while (i < n1 && j < n2) {
            if (liftSubArr[i] <= rightSubArr[j]) {
                arr[k] = liftSubArr[i];
                i++;
            }
            else {
                arr[k] = rightSubArr[j];
                j++;
            }
            k++;
        }
 
        // Copy remaining elements of liftSubArr[]
        while (i < n1) {
            arr[k] = liftSubArr[i];
            i++;
            k++;
        }
 
        // Copy remaining elements of rightSubArr[] 
        while (j < n2) {
            arr[k] = rightSubArr[j];
            j++;
            k++;
        }
    }
    // Main function that sorts array using >>>> merge()
  
  public  void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the mid
            int m =l+ (r-l)/2;
 
            // Sort first and second halves
            sort(arr, l, m); //lift
            sort(arr, m + 1, r);//right
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    
  public  static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
 
        System.out.println(" Array befor sort");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);
 
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
