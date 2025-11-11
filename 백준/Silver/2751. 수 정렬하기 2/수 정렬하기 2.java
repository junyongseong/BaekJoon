import java.io.*;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<Integer> set= new TreeSet<>();

        for(int i=0; i<N;i++){
            int A = Integer.parseInt(br.readLine());
            set.add(A);
        }
        for(int i :set){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}