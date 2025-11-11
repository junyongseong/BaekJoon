import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] semina =new String[7];
        int[] myeong = new int[7];
        for(int i =0; i<7;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            semina[i] =st.nextToken();
            myeong[i] = Integer.parseInt(st.nextToken());
        }
        int result=0;
        for(int i =0;i<7;i++){
            if(myeong[i]>myeong[result])
                result=i;
        }
        System.out.println(semina[result]);
    }
}