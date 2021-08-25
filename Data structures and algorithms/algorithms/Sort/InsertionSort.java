package com.Sort;

public class InsertionSort {
    public static void insertionSort(int array[]) {  
        int size = array.length;  
        for (int j = 1; j < size; j++) { 
        //	We started at index 1 because we assumed index 0 was true
            int key = array[j]; // second element | 1 > 2 > 3 > 4 ....
            int i = j-1; // first element   | 0 > 1 > 2 > 3 ....
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  //shifting
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {9,14,3,2,43,11,58,22};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    

}
