import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        String arr[] = new String[]{"apple", "banana", "grape", "blueberry", "orange"};

        int num = 0; //만족하는 수
        for(int i = 0;i<arr.length;i++){
            if(arr[i].charAt(2)==a || arr[i].charAt(3)==a){
                System.out.println(arr[i]);
                num++;
            }
        }

        System.out.print(num);

    }
}