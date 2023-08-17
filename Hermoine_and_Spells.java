import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
       //int r=x%(y*z);
       int l;
       if(x<y&&x<z){
          l=x;
       }
       else if(y<x&&y<z){
          l=y;
       }
       else{
           l=z;
       }
       System.out.println(x+y+z-l);
    }
}