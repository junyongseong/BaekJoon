import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());//금액 N
        int M = Integer.parseInt(st.nextToken());//금액 N

        int result=N;
        while (N >=M){
            N = N/M;
            result +=N;
        }
        System.out.println(result);
    }
}