import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String S =br.readLine();
        int B=0;
        for(int i=0;i<A;i++){
            B +=S.charAt(i) -'0';
        }
        System.out.println(B);

    }
}