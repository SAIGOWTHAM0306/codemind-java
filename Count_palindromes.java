import java.util.*;
public class Main{
    public static boolean isPalindrome(int n){
        int k=n,rev=0;
        while(k!=0){
            rev=rev*10+k%10;
            k=k/10;
        }
        if(n==rev){
            return true;
        }
        else{
            return false;
        }
    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
	//	int brr[]=new int[n];
		int sum=0,avg,c=0;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    if(isPalindrome(arr[i])){
		        /*System.out.print(arr[i]);
		        break;*/
		        c++;
		    }
		    
		}
		System.out.println(c);
	}
}