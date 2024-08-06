import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[200];

        int idx = 0;
        while(true){
            String input = sc.next();

            if(input.equals("0")){
                
                break;
            }

            arr[idx] = input;
            idx++;
        }
        System.out.println(idx);
        for(int i = 0;i<arr.length;i+=2){
            if(arr[i] != null ){
                System.out.println(arr[i]);
            }
            
        }
    }
}