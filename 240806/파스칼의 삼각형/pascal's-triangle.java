import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[100][100];
        int num = 0;
        for(int i = 0;i<n;i++){
            num++;
            for(int j = 0;j<num;j++){
                if(num == 1){
                    arr[i][j] = 1;
                }else{
                    if(i-1>=0 && j-1>=0){
                        arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    }else if(i-1>=0 && j-1<=0){
                        arr[i][j] = arr[i-1][j];
                    }
                }

            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(arr[i][j]>0){
                    System.out.printf("%d ",arr[i][j]);
                }
                
            }
            System.out.println();
        }
    }
}