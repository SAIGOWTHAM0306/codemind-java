import java.util.Scanner;
public class Solution{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    if((a+b*2)>=x){
        System.out.println("Qualify");
    }
    else{
        System.out.println("Not Qualify");
    }
}
}
