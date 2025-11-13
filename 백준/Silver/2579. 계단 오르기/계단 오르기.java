import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        //dp문제?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N+1];
        int[] score = new int[N+1];

        //N번째 계단 도착 방법 두개 한칸 + 한칸 or 두칸
        //N-2 -> N 이방법 OR N-3-> n-1 ->N방법 
        //N-3 ->N-2-> N방법도 물리적으로 가능하지만 최대점수를 얻기 위해선
        // 그 이전것도 밟을 수 있어야함

        for(int i =1;i<=N; i++){
            score[i] = Integer.parseInt(br.readLine());
        }
        if(N==1){
            System.out.println(score[1]);
            return;//종료
        }
        //초기값 세팅
        dp[1] = score[1];//1번 계단
        dp[2] = score[1]+score[2];//2번 계단
        //3번게단 여기서 부터 최대값 체크 해줘야함
        // dp[3] = max(score[1]+score[3],score[2]+score[3])
        for(int i=3 ;i<=N;i++){
            dp[i] = Math.max(dp[i-2]+score[i], dp[i-3]+score[i-1]+score[i]);
        }
        System.out.println(dp[N]);

    }
}