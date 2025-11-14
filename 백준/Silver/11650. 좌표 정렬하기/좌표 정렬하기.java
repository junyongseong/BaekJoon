
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] ar = new int[N][2];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            ar[i][0] = Integer.parseInt(st.nextToken());//X좌표
            ar[i][1] = Integer.parseInt(st.nextToken());//Y좌표
        }
        // 정렬 (array.sort로 )
        //comperatior 람다로 축약
        Arrays.sort(ar, (x, y) -> {
            if (x[0] == y[0]) {
                // x좌표 같으면 y자표로 비교
                return x[1] - y[1];
            }
            // x좌표 다르면 X좌표로 비교
            return x[0] - y[0];
        });

        for (int i = 0; i < N; i++) {
            sb.append(ar[i][0]).append(" ").append(ar[i][1]).append("\n");
        }

        System.out.print(sb);

    }
}
