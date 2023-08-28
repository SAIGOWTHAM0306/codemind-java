import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int f=1;
        for(int i=0;i<n;i++){
            int c=0;
            for(int k=0;k<n;k++){
                if(nums[i]==nums[k]){
                    c++;
                   // f=0;
                }
            }
            if(c==1){
                System.out.print(nums[i]+" ");
                f=0;
                //break;
            }
            /*if(f==0){
                System.out.print(-1);
            }*/
        }
         if(f==1){
             System.out.print(-1);
         }               
       /* int c=findNumbers(nums);
        System.out.println(c);*/
    }
}