import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A*(B%10));
        System.out.println(A*((B/10)%10));
        System.out.println(A*(B/100));
        System.out.println(A*B);

        sc.close();
    }
}