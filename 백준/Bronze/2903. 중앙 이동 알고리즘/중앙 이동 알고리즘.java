import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());

        Double S = Math.pow(2, N);
        int result = (int)((S+1)*(S+1));
        System.out.println(result);
    }
}