import java.util.*;
public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int brr[]=new int[n];
		int sum=0,avg;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<n;i++){
		    if(arr[i]>min){
		        min=arr[i];
		    }
		}
		System.out.println(min);
	}
}