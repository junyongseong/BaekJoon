import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int A = (Integer.parseInt(st.nextToken()));
        int B = (Integer.parseInt(st.nextToken()));

        if (A != 0) {
            if (B < 45) {
                System.out.print(A - 1 + " ");
                System.out.print(B - 45 + 60);
            } else {
                System.out.print(A + " ");
                System.out.print(B - 45);
            }
        }else{
            if (B < 45) {
                System.out.print(23+" ");
                System.out.print(B - 45 + 60);
            } else {
                System.out.print(A+" ");
                System.out.print(B - 45);
            }
        }
    }
}