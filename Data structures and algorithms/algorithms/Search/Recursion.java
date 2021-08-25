package com.searsh;

public class Recursion {
static int count=0;
static int n1=0; // = base case 0
static int n2=1; // =base case 1
static int n3;	 // =sum n1+n2
public static void main (String []agrs) 
		{
		System.out.print(n1 +" "+n2);
		 int num=5;
		 printFab(num-2);
		 System.out.println("\n" +sumRange(4, 6));
		}
// the  base concept of the Recursion 
public static void fun() 
		{
		if (count==5) // base case
		{
			return;
		}
		else 
		{
			count++;
			System.out.println("hi");
			fun();
		} 
		}
// how solve Factorial with the recursion
public 	static int fact(int n) 
		{
		if (n==1 || n==0)
		{	
			return 1;
		}	
		else 
		{	
			return  n*fact(n-1);
		}
		}
// Fibonacci series with the recursion
public static int fab(int n) // n=4 ...> n=3 ..>n=2 ..>n=1
		{
		if (n==0 || n==1) // n = 1;
			return n;
		else 
		
			return (fab (n-1)+fab(n-2));
			  //fab(3) + fab(2) >>2+1
			  //      |
			  //fab(2)+fab(1) >>1+1
			  // 	  |
		      //fab(1)+fab(0) >> 1+0
		
		}
//how we can print a Fibonacci series with 
//the recursion
public static void printFab(int n)
		{
		if(n>0) 
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			printFab(n-1);
		}
		}
// how we can sum of numbers in range of numbers
//4 ....8 >> = 4+5+6+7+8=
public static int sumRange(int n1 ,int n2)
		{
		 if (n1==n2)
			 return n1;
		 else 
		 {
		 return n1+sumRange(n1+1, n2) ;
		 }
		}
}
		


