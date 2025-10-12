import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());// 바구니 개수
        int B = Integer.parseInt(st.nextToken());// 바꿀 횟수
        int N[] = new int[A];// 바구니 배열

        for (int x = 0; x < A; x++) {
            N[x] = x + 1;
        }
        for (int x = 0; x < B; x++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int tmp = N[i - 1];
            N[i - 1] = N[j - 1];
            N[j - 1] = tmp;
        }
        for (int i = 0; i < A; i++) {
            System.out.print(N[i] + " ");
        }
    }
}