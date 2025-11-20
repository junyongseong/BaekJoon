import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int T = Integer.parseInt(br.readLine());//테케

        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            Map<String,Integer> map = new HashMap<>();

            for(int j=0;j<N;j++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");

                st.nextToken();//앞부분은 필요 없음

                String type = st.nextToken();//무슨 타입인지 저장
                map.put(type,map.getOrDefault(type,0)+1);
            }
            int cnt =1;
            for(int j:map.values()){
                cnt *= j+1;
            }
            System.out.println(cnt-1);

        }
    }
}