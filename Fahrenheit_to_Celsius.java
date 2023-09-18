import java.util.*;
public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int f=sc.nextInt();
	//	double f=(c*1.8)+32;
		double c=(f-32)/1.8;
		System.out.printf("%.2f",c);
	}
}