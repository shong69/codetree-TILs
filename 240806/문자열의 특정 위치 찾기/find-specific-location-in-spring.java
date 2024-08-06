import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char c = sc.next().charAt(0);

        int n = str.indexOf(c);
        if(n>0){
            System.out.print(n);
        }else{
            System.out.print("No");
        }
        
    }
}