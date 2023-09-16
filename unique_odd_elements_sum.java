// Java program to print all distinct
// elements in a given array
import java.io.*;
import java.util.*;

public class GFG {

	static void printDistinct(int arr[], int n)
	{
		// Pick all elements one by one\n		int sum=0;
		for (int i = 0; i < n; i++)
		{
			// Check if the picked element
			// is already printed
			int j;
			for (j = 0; j < i; j++)
			if (arr[i] == arr[j])
				break;
	
			// If not printed earlier,
			// then print it
			if (i == j && arr[i]%2!=0){
			    sum+=arr[i];
			}
			
			//System.out.print( arr[i] + " ");
		}
		System.out.print(sum);
	}
	
	// Driver program
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int m = arr.length;
		printDistinct(arr, m);

	}
}

// This code is contributed by vt_m
