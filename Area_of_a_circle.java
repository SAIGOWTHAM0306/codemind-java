import java.util.Scanner;
public class Temperature{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        int r;
        double A;
        r = s.nextInt();
        A = 3.14 *r*r;
        System.out.printf("%.2f",A);
    }
}  