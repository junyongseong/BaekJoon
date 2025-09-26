import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str," ");

        int A = (Integer.parseInt(st.nextToken()));
        int B = (Integer.parseInt(st.nextToken()));

        System.out.println((A>B) ?">":(A<B) ? "<":"==");

    }
}