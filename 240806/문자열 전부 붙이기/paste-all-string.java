import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = "";
        for(int i = 0;i<n+1;i++){
            str += sc.nextLine();
        }

        System.out.print(str);
    }
}