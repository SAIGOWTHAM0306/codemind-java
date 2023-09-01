import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String s =sc.nextLine();
   int sum=0,max=0;
   for (int i = 0; i < s.length(); i++) {
       char ch=s.charAt(i);
       if((int)ch>max){
           max=(int)ch;
       }
      /*if(Character.isDigit(s.charAt(i))) 
      sum=sum+Character.getNumericValue(s.charAt(i));
      }*/
  }
   System.out.println((char)max);
}
}