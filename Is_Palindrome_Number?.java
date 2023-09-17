import java.util.*;
public class Main{
    public static int palindrome(int n){
        int k=n,rev=0;
        while(k!=0){
            rev=rev*10+k%10;
            k=k/10;
        }
        if(n==rev){
            return 2;
        }
        else{
            return 1;
        }
    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(palindrome(n));
	}
}