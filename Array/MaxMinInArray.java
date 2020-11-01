package array;

import java.util.Scanner;

public class MaxMinInArray 
{
	static Scanner sc = new Scanner(System.in);
	public static void createArray(int[] array)
	{
		System.out.println("Enter the Elements of the array");
		for (int i = 0; i < array.length; i++)
		{
			System.out.print("Enter element "+i+" ");
			array[i] = sc.nextInt();
		}
	}
	
	public static void viewArray(int[] array)
	{
		System.out.print("The array elements are : ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void max(int[] array)
	{
		System.out.println("Finding max element : ");
		int max = array[0];
		for (int i = 1; i < array.length; i++) 
		{
			if(max<array[i])
			{
				max = array[i];
			}
		}
		System.out.println("The max element in the array is : "+max);
	}
	
	public static void min(int[] array)
	{
		System.out.println("Finding min element : ");
		int min = array[0];
		for (int i = 1; i < array.length; i++) 
		{
			if(min>array[0])
			{
				min = array[i];
			}
		}
		System.out.println("The mim element in the array is : "+min);
	}

	public static void main(String[] args) 
	{
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] array = new int[size];
		createArray(array);
		viewArray(array);
		max(array);
		min(array);
	}

}
