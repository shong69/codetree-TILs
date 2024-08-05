import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //4
        int m = sc.nextInt(); //6
        /*
            00 
            01 10 
            02 11 20 
            03 12 21 30
            04 13 22 31 
            05 14 23 32 
            15 24 33
            25 34
            35
        */
        //반복 횟수 = n + m -1
        //원소 나열 횟수 =  1)x가 n-1이 될 때까지 || 2) y가 0이 될 때까지
        //y는 m-1이 될 때까지 1씩 늘어난다
        //y가 m-1이 되면 그 때부터 x를 1씩 늘린다
        int[][] arr = new int[n][m];
        int num = 1;
        int x = 0;
        int y = 0;

        for(int i = 0;i<=n+m-1;i++){
            if(y>m-1){
                x += 1;
                y=m-1;
            }else{
                x=0;
            }
            int xNum = x;
            int yNum = y;
            while(xNum<=n-1 && yNum>=0){
                arr[xNum][yNum] = num;
                num++;
                xNum++;
                yNum--;
            }
            y++;
        }


        for(int s =0;s<n;s++){
            for(int t =0;t<m;t++){
                System.out.printf("%d ",arr[s][t]);
            }
            System.out.println();
        }
    }
}