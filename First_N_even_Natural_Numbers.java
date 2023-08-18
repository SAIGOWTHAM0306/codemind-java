import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pro=1;
        for(int i=n*2;i>0;i-=2){
            System.out.print(i+" ");
        }
           // System.out.println(pro);
    }
}