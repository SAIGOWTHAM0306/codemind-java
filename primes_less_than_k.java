import java.util.*;
public class Main{
    public static boolean isPrime(int n) {
        // 0 and 1 are neither prime nor composite numbers
        if (n == 0 || n == 1) {
            return false;
        }
        // 2 is a prime number
        if (n == 2) {
            return true;
        }
        // every composite number has a prime factor
        // less than or equal to its square root.
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
 
    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	//	int m=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int c=0;
		//float sum=0;
		for(int i=0;i<n;i++){
		    if(isPrime(arr[i])&&arr[i]<=m){
		        //sum+=arr[i];
		        c++;
		    }
		}
		//float avg=sum/c;
		System.out.println(c);
	}
}