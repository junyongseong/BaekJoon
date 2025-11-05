import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());//동전 종류
        int K = Integer.parseInt(st.nextToken());// 동전 합

        int [] coin = new int[N];
        int count =0;
        for(int i=0; i<N; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        //먼저 맨 마지막 것부터 확인 탐욕문제?

        for(int i=N-1;i>=0; i--){
            // if(coin[N-1]/K)
                if(K%coin[i]==coin[i])
                    count +=0;
                else{
                    count += K/coin[i];
                    K = K % coin[i];
                }
        }
        System.out.println(count);
    }
}