import java.util.*;
public class GFG {

	// Function to print N Fibonacci Number
	static int Fibonacci(int N)
	{
		int num1 = 0, num2 = 1;

		int counter = 0;

		// Iterate till counter is N
		int num3=N;
		while (num3 <= N) {

			// Print the number
			//System.out.print(num1 + " ");

			// Swap
			num3 = num2 + num1;
			if(num3==N){
			    return 1;
			}
			num1 = num2;
			num2 = num3;
		//	counter = counter + 1;
		}
		return 0;
	}

	// Driver Code
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int N =sc.nextInt();

		// Function Call
		int tf=Fibonacci(N);
		if(tf==1){
		    	System.out.print("True");
		}
		else{
		    	System.out.print("False");
		}
	//	System.out.print(Fibonacci(N));
	}
}