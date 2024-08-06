import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int num = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                num++;
            }else{
                sb.append(str.charAt(i-1));
                sb.append(Integer.toString(num));
                num = 1;

            }
        }
        sb.append(str.charAt(str.length()-1));
        sb.append(num);

        System.out.println(sb.length());

        System.out.print(sb.toString());
    }
}