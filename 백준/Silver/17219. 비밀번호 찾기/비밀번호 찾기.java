import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String,String> map = new HashMap<>();
        for(int i=0; i<N; i++){
            StringTokenizer st2= new StringTokenizer(br.readLine()," ");
            map.put(st2.nextToken(), st2.nextToken());
        }//비번저장
        
        //찾아야할 비번
        for(int i=0; i<M;i++){
            String str = br.readLine();
            bw.write(map.get(str)+"\n");
        }
        bw.flush();
        bw.close();


    }
}