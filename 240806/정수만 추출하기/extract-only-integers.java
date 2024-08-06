import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        
        String num1="";
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)>='0' && str1.charAt(i)<='9'){
                num1 += str1.charAt(i);
            }else{
                break;
            }
        }
        String num2="";
        for(int i=0;i<str2.length();i++){
            if(str2.charAt(i)>='0' && str2.charAt(i)<='9'){
                num2 += str2.charAt(i);
            }else{
                break;
            }
        }
        System.out.print(Integer.parseInt(num1) + Integer.parseInt(num2));
    }
}