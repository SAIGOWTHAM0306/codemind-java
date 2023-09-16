import java.util.*;
public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[n];
		int brr[]=new int[n];
		int sum=0,avg,c=0;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    //sum+=arr[i];
		}
		for(int i=0;i<n;i++){
		    if(arr[i]%m!=0){
		        //System.out.print(arr[i]);
		        //break;
		        c++;
		    }
		    
		}
		System.out.println(c);
	}
}