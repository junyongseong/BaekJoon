import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int N = Integer.parseInt(br.readLine());
        int[][] ar = new int[N][2];//좌표 저장할 배열
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            ar[i][0] = Integer.parseInt(st.nextToken());
            ar[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(ar,(x,y)->{
            if(y[1]==x[1]){//y가 같으면임 x가 같으려면 0 0 
                return x[0]-y[0];
            }
            return x[1]-y[1];
        });
        for (int i = 0; i < N; i++) {
            sb.append(ar[i][0]).append(" ").append(ar[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}