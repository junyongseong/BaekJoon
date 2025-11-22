import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());// 배열에 넣을거
        int N = Integer.parseInt(st.nextToken());

        
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int[] ar = new int[M + 1];
        for (int i = 1; i <= M; i++) {
            ar[i] = Integer.parseInt(st2.nextToken());
        }
        //구간합 구해놓기
        int[] sum = new int[M + 1];
        for (int i = 1; i <= M; i++) {
            sum[i] = sum[i - 1] + ar[i];
        }
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st3.nextToken());
            int end = Integer.parseInt(st3.nextToken());

            sb.append(sum[end]-sum[start-1]).append("\n");
        }
        System.out.println(sb);
    }
}