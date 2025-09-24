
import java.util.*;

class Main {
    public static void main(String[] args) {
        // 코드 작성
        Scanner sc = new Scanner(System.in);

        int A= sc.nextInt();

        int B = sc.nextInt();

        if(B>=10)
            System.out.println("범위 벗어남");

            sc.close();
        System.out.println(A*B);
    }
}