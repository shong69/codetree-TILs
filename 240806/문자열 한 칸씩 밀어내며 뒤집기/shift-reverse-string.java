import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int quiry = sc.nextInt();
            switch(quiry){
                case 1: str = switch1(str);break;
                case 2: str = switch2(str); break;
                case 3: str = switch3(str);break;
            }
        }
    }
    public static String switch1(String str){

        String result = str.substring(1)+str.substring(0,1);
        System.out.println(result);
        return result;
    }
    public static String switch2(String str){
        String result = str.substring(str.length()-1) + str.substring(0,str.length()-1);
        System.out.println(result);
        return result;
    }
    public static String switch3(String str){
        char[] arr = str.toCharArray();
        String result = "";
        for(int i = arr.length;i>0;i--){
            result += arr[i-1];
        }
        System.out.println(result);
        return String.valueOf(result);
    }
}