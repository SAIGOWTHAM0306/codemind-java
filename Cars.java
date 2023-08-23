import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int a=z,b=0,c=0;
        if(x<y){
        while(b<=a){
            a=a+x;
            b=b+y;
            c++;
        }
        System.out.print(c);
        }
        else{
            System.out.print(-1);
        }
    }
}