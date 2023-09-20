import java.util.*;
public class reverseString {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String[] arr=s.split(" ");
            for(int i=arr.length-1;i>=0;i--){
                /*if(arr[i]==(char)32){
                    continue;
                }*/
                System.out.print(arr[i]+" ");
            }
        }
    }