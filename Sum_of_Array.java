import java.util.*;
public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
// 		for(int i=0;i<n;i++){
// 		    sum=sum+arr[i];
// 		}
        for(int eachele:arr){
            sum+=eachele;
        }
		System.out.println(sum);
	}
}