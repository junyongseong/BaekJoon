import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int N[] = new int[A];
        double M[] = new double[A];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < A; i++) {
            N[i] = Integer.parseInt(st.nextToken());
        }
        int b=0;

        for(int i=0; i<A; i++){
            if(N[i]>b)
                b=N[i];
        }
        for(int i=0; i<A;i++){
            M[i] =(N[i]/(double)b*100.0);
        }
        double s=0.0;
        for (int i = 0; i < A; i++) {
            s +=M[i];
        }
        System.out.println(s/A);
    }
}