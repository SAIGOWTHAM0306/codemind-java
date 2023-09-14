import java.util.*;
public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int brr[]=new int[n];
		int sum=0,avg,c=0;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    //sum+=arr[i];
		}
		//avg=sum/n;
		int j=0;
		for(int i=0;i<n;i++){
		    if(arr[i]%2==0){
		        brr[j++]=arr[i];
		    }
		}
		for(int i=0;i<n;i++){
		    if(arr[i]%2!=0){
		        brr[j++]=arr[i];
		    }
		    System.out.print(brr[i]+" ");
		}
		//System.out.println(c);
	}
}