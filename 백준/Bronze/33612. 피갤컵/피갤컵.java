import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int year = 2024;
        int mon = 8+(N-1)*7;//1일때 제외

        year +=(mon-1)/12;
        mon = ((mon-1)%12)+1;

        System.out.printf("%d %d",year,mon);

    }
}