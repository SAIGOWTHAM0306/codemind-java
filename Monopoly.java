import java.util.Scanner;
public class Monopoly{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int flag=0;
        while(t!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
        if((x+y)<z||(x+z)<y||(y+z)<x){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");   
        }
            t--;
        }
    }
}