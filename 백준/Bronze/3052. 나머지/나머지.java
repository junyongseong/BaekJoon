import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<10; i++){
            int A = Integer.parseInt(br.readLine());
            set.add(A%42);
        }
        System.out.println(set.size());
    }
}