import java.io.*;

class Main {
    static Integer[][] dp = new Integer[41][2];
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=  new StringBuilder();
        int T =Integer.parseInt(br.readLine());

        dp[0][0] =1; //N 0 0
        dp[0][1] =0; // N 0 1
        dp[1][0] =0; //N 1 0
        dp[1][1] =1; //N 1 1

        //fibo(0) && fibo(1) 호출 횟수를 구하는 문제
        while (T --> 0) {
            int N = Integer.parseInt(br.readLine());
            fibona(N);
            sb.append(dp[N][0]).append(" ").append(dp[N][1]).append("\n");
            
        }
        System.out.println(sb);
        
    }
    static Integer[] fibona(int N){
        if(dp[N][0] == null || dp[N][1] ==null){
            dp[N][0] = fibona(N-1)[0] +fibona(N-2)[0];
            dp[N][1] = fibona(N-1)[1] +fibona(N-2)[1];
        }
        return dp[N];
    }
}