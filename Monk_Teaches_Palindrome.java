import java.util.*;
public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            String str=sc.next();
            StringBuilder sb=new StringBuilder(str);
            sb.reverse();
            String rev=sb.toString();
            if(!str.equals(rev)){
                System.out.println("NO");
            }
            else{
                if(str.length()%2==0){
                    System.out.println("YES EVEN");
                }
                else{
                    System.out.println("YES ODD");
                }
            }
            
        }
	}
}