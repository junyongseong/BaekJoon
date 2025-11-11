import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int T1 = Integer.parseInt(st.nextToken());
        int F1 = Integer.parseInt(st.nextToken());
        int S1 = Integer.parseInt(st.nextToken());
        int P1 = Integer.parseInt(st.nextToken());
        int C1 = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int T2 = Integer.parseInt(st2.nextToken());
        int F2 = Integer.parseInt(st2.nextToken());
        int S2 = Integer.parseInt(st2.nextToken());
        int P2 = Integer.parseInt(st2.nextToken());
        int C2 = Integer.parseInt(st2.nextToken());

        System.out.print(T1*6+F1*3+S1*2+P1+C1*2+" ");
        System.out.print(T2*6+F2*3+S2*2+P2+C2*2);
    }
}