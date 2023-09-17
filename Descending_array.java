import java.util.*;
public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0,avg,c=0;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int f=1;
		for(int i=0;i<n-1;i++){
		    if(arr[i]<arr[i+1]){
		        System.out.println("no");
		        f=0;
		    }
		}
		if(f==1){
		System.out.println("yes");
		}
	}
}