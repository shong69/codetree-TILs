import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String sub = sc.next();

        boolean isTrue = true;
        while(isTrue){
            int idx = str.indexOf(sub);
            if(idx>=0){
                String str1 = str.substring(0,idx) + str.substring(idx+sub.length());
                str = str1;
            }else{
                isTrue = false;
            }
        }
        System.out.print(str);
    }
}