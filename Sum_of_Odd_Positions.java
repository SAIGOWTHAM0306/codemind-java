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
		int sum=0;
// 		for(int i=0;i<n;i++){
// 		    sum=sum+arr[i];
// 		}
        // for(int eachele:arr){
        //     if(eachele%2!=0){
        //       sum+=eachele;
        //     }
        // }
        for(int i=1;i<n;i+=2){
		    //arr[i]=sc.nextInt();
		    sum+=arr[i];
		}
		System.out.println(sum);
	}
}