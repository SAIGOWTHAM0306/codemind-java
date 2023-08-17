import java.util.Scanner;
public class Solution{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(b-a>0){
        System.out.println("Profit");
    }
    else if(b-a<0){
        System.out.println("Loss");
    }
    else{
        System.out.println("No profit and No loss");
    }
}
}
