package code.sorting;

import java.util.Scanner;

public class BubbleSort 
{
	public static void viewArray(int[] array)
	{
		System.out.print("Array elements are : ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	public static int[] bubbleSort(int[] array)
	{
		//Using the two for loops
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length-i-1; j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = scan.nextInt();
		int array[] = new int[size];
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.print("Enter "+i+"th element of array :");
			array[i] = scan.nextInt();
		}
		System.out.println("Array Element before sort : ");
		viewArray(array);
		System.out.println("Array Element after sort : ");
		array=bubbleSort(array);
		viewArray(array);	
	}

}
