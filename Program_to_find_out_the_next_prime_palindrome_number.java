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
  static boolean checkPalindrome(int n)
  {
    int reverse = 0;
    int temp = n;
    while (temp != 0) {
      reverse = (reverse * 10) + (temp % 10);
      temp = temp / 10;
    }
    return (reverse == n);
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=x+1;;i++){
            if(isPrime(i)==true&&checkPalindrome(i)==true){
                System.out.println(i);
                break;
            }
        }
    }
}