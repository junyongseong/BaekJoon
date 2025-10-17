import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String A =br.readLine();
        int B= Integer.parseInt(br.readLine());
        System.out.println(A.charAt(B-1));
    }
}