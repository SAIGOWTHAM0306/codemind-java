import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,rem,original=n;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
       if(rev==original){
           System.out.println("Palindrome");
       } 
       else{
           System.out.println("Not Palindrome");
       }
    }
}