import java.util.*;
public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0.0,a=0;
		for(int i=1;i<=n;i++){
		    a=(double)1/i;
		    sum=sum+a;
		}
		System.out.printf("%.2f",sum);
	}
}