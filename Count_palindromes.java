import java.util.*;
public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int brr[]=new int[n];
		int avg,c=0;
		for(int i=0;i<n;i++){
		    int sum=0;
		    arr[i]=sc.nextInt();
		    int k=arr[i];
		    while(k!=0){
		        int rem=k%10;
		        sum=sum*10+rem;
		        k=k/10;
		    }
		    if(sum==arr[i]){
		        c++;
		    }
		    //System.out.print(sum+" ");
		    //sum+=arr[i];
		    //sum+=arr[i];
		}
		/*for(int i=n-1;i>=0;i--){
		    if(arr[i]%2!=0){
		        System.out.print(arr[i]);
		        break;
		    }
		    
		}*/
		System.out.println(c);
	}
}