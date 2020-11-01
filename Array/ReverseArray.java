package array;

import java.util.Scanner;

public class ReverseArray 
{
	public static void viewArray(int[] array)
	{
		System.out.print("Array Elements are : ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
	}
	
	public static int[] reverseArray(int[] array)
	{
		int lastElement = array.length - 1;
		for (int i = 0; i < array.length/2; i++) 
		{
			int temp = array[i];
			array[i] = array[lastElement];
			array[lastElement] = temp;
			lastElement--;
		}
		return array;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print("Element "+i+" : ");
			array[i] = sc.nextInt();
		}
		System.out.println("The array element before reversing : ");
		viewArray(array);
		System.out.println("The array element after reversing : ");
		reverseArray(array);
		viewArray(array);
		sc.close();
	}

}
