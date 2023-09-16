import java.util.Scanner;
public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R,C;
        R=sc.nextInt();
        C=sc.nextInt();
        //create a 2-D array which is capable of
        //storing R rows and C columns
        int[][] arr=new int[R][C];
        //reading
        for (int i=0;i<R;i++){//i runs on rows
            for (int j=0;j<C;j++){//j runs on columns
                arr[i][j]=sc.nextInt();
            }
        }
        //accessing
        int sum=0;
        for (int i=0;i<R;i++){//i runs on rows
            for (int j=0;j<C;j++){//j runs on columns
                //System.out.println(arr[i][j]*arr[i][j]+" ");
                if(i==0 || j==0 || i==R-1 || j==R-1){
                    sum+=arr[i][j];
                }
            }
          // System.out.println();
        }
        System.out.println(sum);
    }
}
