import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int num = sc.nextInt();

        for(int i = 0;i<num;i++){
            int type = sc.nextInt();
            switch(type){
                case 1: 
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    str = exchange(str, a, b);break;
                case 2: 
                    char a2 = sc.next().charAt(0);
                    char b2 = sc.next().charAt(0);
                    str = changeAll(str, a2, b2);break;
            }
        }
    }
    public static String exchange(String str, int a, int b){
        char[] arr = str.toCharArray();
        char char1 = arr[a-1];
        arr[a-1] = arr[b-1];
        arr[b-1] = char1;
        str=String.valueOf(arr);
        System.out.print(str);
        System.out.println();
        return str;
    }
    public static String changeAll(String str, char a, char b){
        char[] arr = str.toCharArray();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==a){
                arr[i] = b;
            }
        }
        str=String.valueOf(arr);
        System.out.print(str);
        System.out.println();
        return str;
    }
}