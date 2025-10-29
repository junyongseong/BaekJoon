import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        int ar[] = new int[N];
        for(int i=0;i<N;i++){
            ar[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(ar);
        for(int i:ar){
            sb.append(i).append("\n");
        }
        System.out.println(sb);

    }
}