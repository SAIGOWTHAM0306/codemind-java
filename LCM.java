// Java program to find LCM of 2 numbers

import java.util.Scanner;

public class LCM {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int lcm = findLCM(a, b);
		System.out.println(lcm);
		sc.close();
	}
	// Function to return LCM of two numbers
	public static int findLCM(int a, int b)
	{
		int greater = Math.max(a, b);
		int smallest = Math.min(a, b);
		for (int i = greater;; i += greater) {
			if (i % smallest == 0)
				return i;
		}
	}
}
