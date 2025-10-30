import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine()," ");

        int N= Integer.parseInt(st.nextToken());
        int K= Integer.parseInt(st.nextToken());

        System.out.println(Bc(N,K));
    }
    static int Bc(int N,int K){
        //이항계수의 특징 N==K이거니ㅏ K=0이면 1이다
        if(N==K || K==0)
            return 1;

        //그 외일때 재귀함수 호출로 반복(파스칼의 재귀식)
         //동적 테이브(DP)로도 풀어보기
        return Bc(N-1,K-1)+Bc(N-1,K);
    }
}