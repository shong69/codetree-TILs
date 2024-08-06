import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char char0 = sc.next().charAt(0);

        int num = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==char0){
                num++;
            }
        }

        System.out.print(num);
    }
}