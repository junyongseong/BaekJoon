import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] B = new int[6];
        for(int i=0;i<6;i++){
            B[i] =Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine()," ");
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int C =0;
        for(int i=0;i<6;i++){
            C +=(B[i]+T-1)/T ;
        }
        int D =A/P;
        int E=A%P;

        System.out.println(C);
        System.out.printf("%d %d",D,E);
        
    }
}