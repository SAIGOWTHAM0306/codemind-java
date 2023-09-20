import java.util.*;
public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	//	String s=String.valueOf(n);
	String s=Integer.toString(n);
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='6'){
		        s=s.substring(0,i)+"9"+s.substring(i+1);
		        break;
		    }
		}
		System.out.println(s);
	}
}