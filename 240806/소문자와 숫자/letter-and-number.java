import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                System.out.print(ch);
            }
            if(ch>='0' && ch<='9'){
                System.out.print(ch);
            }
            if(ch>='A' && ch<='Z'){
                System.out.print(Character.toLowerCase(ch));
            }
            
        }
    }
}