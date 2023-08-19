import java.util.*;
public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int max=arr[0];
// 		for(int i=0;i<n;i++){
// 		    sum=sum+arr[i];
// 		}
        for(int eachele:arr){
            if(eachele>max){
                max=eachele;
            }
        }
		System.out.println(max);
	}
}