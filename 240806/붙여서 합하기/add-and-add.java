import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int sum1 = Integer.parseInt(a + b);
        int sum2 = Integer.parseInt(b + a);

        System.out.print(sum1 + sum2);

    }
}