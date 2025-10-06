import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        for (int i = 0; i < A; i++) {
            for (int a = 0; a < i+1; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}