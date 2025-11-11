import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine()," ");

        int N= Integer.parseInt(st.nextToken());
        int K= Integer.parseInt(st.nextToken());

//        System.out.println(Bc(N,K));
        System.out.println(Dp(N,K));

    }
//    static int Bc(int N,int K){
//        //이항계수의 특징 N==K이거니ㅏ K=0이면 1이다
//        if(N==K || K==0)
//            return 1;
//
//        //그 외일때 재귀함수 호출로 반복(파스칼의 재귀식)
//         //동적 테이브(DP)로도 풀어보기
//        return Bc(N-1,K-1)+Bc(N-1,K);
//    }
    static int Dp(int N,int K){
        //DP테이블 만들기
        int[][] dp= new int[N+1][K+1];

        //테이블 채우기
        for(int n=0;n<=N;n++){
            for(int k=0; k<=Math.min(n,K);k++){
                if (n==k ||k==0){
                    dp[n][k] =1;//맨 왼쪽 오른쪽은 무조건 1
                }else{
                    dp[n][k] =dp[n-1][k-1]+dp[n-1][k];
                }
            }
        }
        return dp[N][K];
    }
}
