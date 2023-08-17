import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
       // int rem=x+y;
       if(21-(x+y)<=10){
           System.out.println(21-(x+y));
       }
       else{
          System.out.println(-1);
       }
    }
}