import java.util.Scanner;
public class Main{
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int c=0;
        for(int i=x;i<=y;i++){
            if(isPrime(i)==true){
               // System.out.println(i+" ");
               c++;
            }
        }
        System.out.println(c);
    }
}