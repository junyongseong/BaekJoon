import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A =Integer.parseInt(br.readLine());
        int B =Integer.parseInt(br.readLine());
        int C =Integer.parseInt(br.readLine());
        String D ="";
        D +=A;
        D+=B;

        System.out.println(A+B-C);
        System.out.println(Integer.parseInt(D)-C);
        
    }
}