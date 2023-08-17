// Java program for checking
// of full prime
import java.util.*;

public class Prime{
	
	// function to check digits
	public static boolean checkDigits(int n)
	{
		// check all digits are prime or not
		while (n > 0) {
			int dig = n % 10;

			// check if digits are prime or not
			if (dig != 2 && dig != 3 &&
				dig != 5 && dig != 7)
				return false;

			n /= 10;
		}

		return true;
	}
	
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
	
	// To check if n is Full Prime
	public static boolean isFullPrime(int n)
	{
		// The order is important here for
		// efficiency
		return (checkDigits(n) && prime(n));
	}
	
	// driver code
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (isFullPrime(n))
			System.out.print( "Mega Prime" );
		else
			System.out.print( "Not Mega Prime");
	}
}

// This code is contributed by rishabh_jain
