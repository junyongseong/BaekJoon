import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = 0;
        int C[] = new int[A];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < A; i++) {
            C[i] = Integer.parseInt(st.nextToken());
        }
        int E = Integer.parseInt(br.readLine());
        for (int i = 0; i < A; i++) {
            if (C[i] == E) {
                B++;
            }
        }
        System.out.println(B);

    }
}