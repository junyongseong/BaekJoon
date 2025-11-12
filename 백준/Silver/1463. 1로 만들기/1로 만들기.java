import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        //그리디 문제? X 반례가 너무 많이 생김 이전값들을 기억해놓고 최소를 찾는 DP문제인듯
        int N = Integer.parseInt(br.readLine());
        // while(true){
        //     if(N%3 !=0 && N%2 !=0)
        //         N =N-1;
        //     else if(N%3 ==0)
        //         N =N/3;
        //     else
        //         N =N/2;
        //     if(N==1)
        //         break;
        // }
        int[] dp = new int[N+1];//이게 최소 실행 인덱스 +1
        dp[1] =0; //1일떄는 0번

        for(int i=2;i<=N;i++){//N번만큼 //1일떄는 이미 위에서 실행
            //case 1 : 먼저 1을 빼는경우
            dp[i] =dp[i-1]+1;

            //case 2: 2로 나뉘어지는경우 먼저 dp[i]로 덮어씌움
            if(i %2==0)
                dp[i] = Math.min(dp[i], dp[i/2]+1);
            //case 3: 3으로 나뉘어지는경우
            if(i%3==0)
                dp[i] =Math.min(dp[i], dp[i/3]+1);

        }
        System.out.println(dp[N]);
    }
}