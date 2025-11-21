import java.io.*;

class Main {
    static long[] dp = new long[101];

    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 1 1 1 2 2 3 4 5 7 9 ? 12
        // 점화식 P(0) =(1)=P(2) =1 && P(n) = P(n-2)+p(n-3)
        dp[1] = dp[2] = dp[3] = 1;

        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }
    }
}