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
		    int k=arr[i];
		    while(k!=0){
		        int rem=k%10;
		        sum+=rem;
		        k=k/10;
		    }
		    //sum+=arr[i];
		    //sum+=arr[i];
		}
		/*for(int i=n-1;i>=0;i--){
		    if(arr[i]%2!=0){
		        System.out.print(arr[i]);
		        break;
		    }
		    
		}*/
		System.out.println(sum);
	}
}