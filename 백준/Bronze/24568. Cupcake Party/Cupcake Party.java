import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine());//큰 컵케이크 박스 8개 들감
        int M  = Integer.parseInt(br.readLine());//작은 컵케이크 박스 3개 들감

        System.out.println(8*N+3*M-28);

    }
}