import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<N;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        int sum=0;
        int total = 0;
        for(int i=0; i<N; i++){
            sum+=list.get(i);
            total += sum;
        }
        System.out.println(total);
        
    }
}