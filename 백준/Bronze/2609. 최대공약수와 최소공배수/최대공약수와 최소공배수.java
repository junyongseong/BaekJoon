import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        //유클리드 호제법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int mxmin = mn(A,B);

        System.out.println(mxmin);
        System.out.println(((A*B))/mxmin);

    }
    public static int mn(int A,int B){
        //나머지가 0일경우에  B를 반환
        if(A%B==0)
            return B;
        else
            return mn(B,A%B);
    }
}