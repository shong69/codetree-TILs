import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[][]= new int[n][n];
        int num = 1;
        boolean isDown= false;

        for(int i= n-1;i>=0;i--){
            if(isDown){
                for(int j = 0;j<n;j++){
                    arr[j][i] = num++;
                    isDown = false;
                }
            }else{
                for(int j = n-1;j>=0;j--){
                    arr[j][i]= num++;
                    isDown = true;
                }
            }
        }

        for(int x = 0; x<n;x++){
            for(int y = 0;y<n;y++){
                System.out.printf("%d ",arr[x][y]);
            }
            System.out.println();
        }
    }
}