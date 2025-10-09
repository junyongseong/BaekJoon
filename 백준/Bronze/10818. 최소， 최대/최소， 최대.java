import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B[] = new int[A];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<A;i++){
            B[i] = Integer.parseInt(st.nextToken());
        }
        int C=B[0];
        int D=B[0];
        for(int i=0; i<A; i++){
            if(B[i]>C){
                C= B[i];
            }
            else if(D>B[i]){
                D=B[i];
            }
        }
        System.out.printf("%d %d",D,C);
    }
}