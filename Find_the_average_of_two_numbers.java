import java.util.Scanner;
public class Temperature{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        int r,b;
//double A;
        r = s.nextInt();
        b = s.nextInt();
       // A = 3.14 *r*r;
      double x= (double)(r+b)/2;
        System.out.printf("%.4f",x);
    }
}  