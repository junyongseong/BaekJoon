import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테케
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i =0;i<T; i++){
            int n = Integer.parseInt(br.readLine());
            int[] dp = new int[11];//11이 최대 케이스
            dp[1] =1;//1일땐 하나
            dp[2] =2;//2일땐 2개
            dp[3] =4;//3일땐 4개
            // dp[4] =7; //4일땐 7개
            for(int j=4;j<11;j++){
                dp[j]=dp[j-1]+dp[j-2]+dp[j-3];
            }
            bw.write(dp[n]+"\n");
        }
        bw.flush();
        bw.close();
    }
}