import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String s = "ee";
        String t = "ab";

        boolean trueS = false;
        boolean trueT = false;

        for(int i = 0;i<str.length()-1;i++){
            if(str.charAt(i) == s.charAt(0) &&str.charAt(i+1) == s.charAt(1)){
                trueS = true;
            }
            if(str.charAt(i) == t.charAt(0) &&str.charAt(i+1) == t.charAt(1)){
                trueT = true;
            }
        }

        System.out.print(trueS?"Yes ":"No ");
        System.out.print(trueT?"Yes ":"No ");
    }
}