package string;

import java.util.Scanner;

public class Reversing 
{
	
	public static void reverse(String s)
	{
		String res = "";
		for (int i = s.length() - 1; i>=0; i--) 
		{
			res += s.charAt(i);
		}
		System.out.println("The reversed String is : "+res);
	}
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter String : ");
		String s = sc.next();
		reverse(s);
	}

}
