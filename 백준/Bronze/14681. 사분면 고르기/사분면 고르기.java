import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = (Integer.parseInt(br.readLine()));
        int Y = (Integer.parseInt(br.readLine()));

        System.out.println((X>0 &&Y>0) ? 1:(X>0 &&Y<0) ? 4:(X<0 && Y>0) ? 2: 3);
    }
}