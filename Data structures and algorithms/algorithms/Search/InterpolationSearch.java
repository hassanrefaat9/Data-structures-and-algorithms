package com.searsh;

public class InterpolationSearch {

	public static void main(String[] args) {
		//implementation array
		int size=1000000;
		int []numbers=new int [size];
		for (int i = 0; i < size; i++)//full array 
		numbers[i]=i+1;
		
		//interpolation search
		int searchNumber=999999;
		int numberOfTry=0;
		int low=0;
		int high =numbers.length-1;
		int mid=0;
		boolean isFound=false;
		while(!isFound)// continues Condition
		{
		
		if (low>high)//break loop
		{
		System.out.println("the number id not found  ");	
		break;
		}
		numberOfTry++;
		// This is the new Form to calcolut the interpolation 
		mid=low+((high-low)/(numbers[high]-numbers[low]))
				*(searchNumber-numbers[low]);
		if(numbers[mid]==searchNumber)
		{
		System.out.println("namber is found");
		break;
		}
		if(numbers[mid]<searchNumber)
		{
		low=mid+1;	
		}
		if(numbers[mid]>searchNumber)
		{
		high=mid-1;	
		}
		}
		System.out.println("namber of try to found number = "+numberOfTry);
		}	
}
