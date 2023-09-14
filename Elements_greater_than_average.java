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
		    sum+=arr[i];
		}
		avg=sum/n;
		for(int i=0;i<n;i++){
		    if(arr[i]>=avg){
		        c++;
		    }
		}
		System.out.println(c);
	}
}