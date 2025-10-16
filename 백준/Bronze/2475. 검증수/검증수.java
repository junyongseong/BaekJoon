import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N[] =new int[5];
        int B=0;
        for(int i=0;i<5;i++){
            int A =Integer.parseInt(st.nextToken());
            N[i]=A*A;
        }
        for(int i=0;i<5;i++){
            B +=N[i];
        }
        System.out.println(B%10);
    }
}