// Java program for checking
// of full prime
import java.util.*;

public class Prime{
	
	// function to check digits
	
	
	// To check if n is prime or not
	public static boolean prime(int n)
	{
		if (n == 1)
			return false;

		// check for all factors
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}
	
	
	// driver code
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int a,b;
		for(int x=1;x<=t;x++){
		    int n=sc.nextInt();
		    for(int i=n;;i++){
		       if(prime(i)){
		           a=i;
		           break;
		       }
		    }
		    for(int j=n;;j--){
		       if(prime(j)){
		           b=j;
		           break;
		       }
		    }
		  //  System.out.println(Math.min(n-b,a-n));
		  int d1=n-b;
		  int d2=a-n;
		  if(d1<=d2){
		      System.out.println(b);
		  }
		  else{
		      System.out.println(a);
		  }
	}
	
}
}

// This code is contributed by rishabh_jain
