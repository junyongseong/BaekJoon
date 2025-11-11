import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //부녀회장이 될테야~
        int T = Integer.parseInt(br.readLine());//테케

        for(int i=0; i<T; i++){
            int K=Integer.parseInt(br.readLine()); //cmd
            int n =Integer.parseInt(br.readLine());//몇호

            int[][] ar =new int[K+1][n+1];
            //먼저 0층처리
            for(int j =1; j<=n; j++){
                ar[0][j] =j; //0층 1호 2호 3 호에는 각각 1 2 3명이런식으로
            }
            //이제 1층부터 K층까지 처리
            for(int j=1; j<=K;j++){//1층부터 시작
                for(int k=1; k<=n;k++){//호수 1호부터 시작
                    ar[j][k]=ar[j][k-1]+ar[j-1][k];
                }

            }
            System.out.println(ar[K][n]);
        }

    }
}