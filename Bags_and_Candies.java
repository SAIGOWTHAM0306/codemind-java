import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
       int r=x%(y*z);
       if(r==0){
           System.out.println(x/(y*z));
       }
       else{
          System.out.println(x/(y*z)+1);
       }
    }
}