package com.searsh;

import java.util.Scanner;

public class LinerSearsh {

	static int searchNum;
	static int count=0;
		public static void main(String[] args) {
			Scanner in =new Scanner (System.in);
			System.out.println("please,Enter search number");
			 searchNum=in.nextInt();
			System.out.println("please Enter size of array");
			int size=in.nextInt();
			int []arr=new int[size];
			//full array
			for (int i = 0; i < size; i++) {
				arr[i]= i+1;
			}
			
			//liner search 
			for (int i = 0; i < size; i++) {
				
				++count;
				if(searchNum==arr[i]) {
					break;
				}
			}
			System.out.println("number is found");
			System.out.println("Number of try ="+count);
		}

		}
