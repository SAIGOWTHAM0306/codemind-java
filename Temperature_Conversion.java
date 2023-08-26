import java.util.Scanner;
public class Temperature{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        double c,f;
        c = s.nextDouble();
        f = 32+((c*9)/5);
        System.out.printf("%.2f",f);
    }
}  