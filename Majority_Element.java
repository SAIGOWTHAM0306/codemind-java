import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int c=0;
            for(int k=0;k<n;k++){
                if(nums[i]==nums[k]){
                    c++;
                }
            }
            if(c>n/2){
                System.out.println(nums[i]);
                break;
            }
        }
       /* int c=findNumbers(nums);
        System.out.println(c);*/
    }
}