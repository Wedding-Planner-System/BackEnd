package com.weddingplanner.pojos;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag =false;
		
		int arr[]=new int[4];
	
		
		Scanner sc=new Scanner(System.in);
		while(!flag)
		{
		System.out.println("1.  BJP");
		System.out.println("2.  NCP");
		System.out.println("3.  MANSE");
		System.out.println("4.  Shivsena");
		System.out.println("5. Show result");
		System.out.println("6. Show winner");
		System.out.println("7. exit");
		
		System.out.println("Enter your choice");
		int choice;
		switch (sc.nextInt()) 
		{
		
		case 1:
			arr[0]=arr[0]+1;
			break;
			
		case 2:
			arr[1]=arr[1]+1;
			break;
		case 3:
			arr[2]=arr[2]+1;
			break;
		case 4:
			arr[3]=arr[3]+1;
			break;
			
		case 5:
			System.out.println("BJP" + " "+ arr[0]);
			System.out.println("NCP" + " "+ arr[1]);
			System.out.println("MANASE" + " "+ arr[2]);
			System.out.println("Shivesena" + " "+ arr[3]);
			break;
			
		case 6:
			int index =999;
			int min =0 ;
			for (int i=0;i< 4;i++)
			{
				if(arr[i] > min)
				{
					index = i ;
					min = arr[i];
				}
			}
			if(index == 0) {
				System.out.println("BJP");
			}
			if(index == 1) {
				System.out.println("NCP");
			}
			if(index == 2) {
				System.out.println("MANSE");
			}
			if(index == 3) {
				System.out.println("Shivsena");
			}
			
					
			break ;

		default:
			break;
		}
		}
	}

}
