import java.util.*;
public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		//int c;
		for(int i=1;i<=t;i++){
		   int c=0;
		   	int l=sc.nextInt();
		int r=sc.nextInt();
		    for(int j=l;j<=r;j++){
		        if(j%10==2||j%10==3||j%10==9){
		            c++;
		        }
		    }
		    	System.out.println(c);
		}
		//System.out.println(c);
	}
}