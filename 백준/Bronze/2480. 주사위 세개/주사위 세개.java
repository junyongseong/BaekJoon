import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");

        int A =(Integer.parseInt(st.nextToken()));
        int B =(Integer.parseInt(st.nextToken()));
        int C =(Integer.parseInt(st.nextToken()));

        int maxVal = Math.max(A, Math.max(B, C));
        if(A == B && B == C)
            System.out.println(10000+A*1000);
        else if(A==B || A==C)
            System.out.println(1000+A*100);
        else if(B==C)
            System.out.println(1000+B*100);
        else{
            System.out.println(maxVal*100);
        }

    }
}