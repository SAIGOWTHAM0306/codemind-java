import java.util.*;
public class EvenNoOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int c=findNumbers(nums);
        System.out.println(c);
    }
    public static int findNumbers(int[] nums){
        int count=0;
        for(int i:nums){
            int len=String.valueOf(i).length();
            if (len % 2 == 0) {
                //System.out.println(len);
                count++;
            }
        }
        return count;
    }
}
