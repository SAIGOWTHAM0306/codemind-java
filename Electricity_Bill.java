import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String c_id=sc.nextLine();
        String c_name=sc.nextLine();
        int x=sc.nextInt();
        //int y=sc.nextInt();
        if(x<=199){
            System.out.printf("%.2f",x*1.20+100);
        }
        else if(x>=200&&x<400){
            System.out.printf("%.2f",x*1.50+100);
        }
        else if(x>=400&&x<600){
            System.out.printf("%.2f",(x*1.80*0.15)+x*1.80);
        }
        else{
            System.out.printf("%.2f",(x*2.00*0.15)+x*2.00);
        }
        
    }
}