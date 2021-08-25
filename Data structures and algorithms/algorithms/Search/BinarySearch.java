package com.searsh;

import java.util.Scanner;

public class BinarySearch {

	 public static void binarySearch(int arr[], int first, int last, int key){  
		   int mid = (first + last)/2; 
		   int count=0;
		   while( first <= last ){ 
			   count++;
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        System.out.println("Element is found after "+count+" try");
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
		 }  
		 public static void main(String args[]){ 
			 Scanner scan=new Scanner(System.in);
			 System.out.println("plese enter size of array");
			int size=scan.nextInt();
			System.out.println("enter search number");
			int key = scan.nextInt(); 
		        int arr[] = new int[size];
		        int last=arr.length-1;  
		          //full array
		        for (int i = 0; i < size; i++) {
					arr[i]=i+1;
				}
		       
		        binarySearch(arr,0,last,key);     
		 } 
	    }


