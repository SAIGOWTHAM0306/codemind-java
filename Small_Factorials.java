import java.util.*;
public class Main{
    public static int fact(int a){
        if(a==0||a==1){
            return 1;
        }
        else{
            return a*fact(a-1);
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();  
        for (int i = 0; i <n; i++) {
            int a = s.nextInt();
            int result=fact(a);
            System.out.println(result);
        }
    }
}