import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A =Integer.parseInt(st.nextToken());
        int B =Integer.parseInt(st.nextToken());
        int D[] = new int[A];
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<A; i++){
            D[i] =Integer.parseInt(st2.nextToken());
        }
        for(int i=0; i<A; i++){
            if(D[i]<B){
                System.out.printf("%d ",D[i]);
            }
        }

    }
}