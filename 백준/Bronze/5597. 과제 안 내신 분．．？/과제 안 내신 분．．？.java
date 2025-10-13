
import java.io.*;
import java.util.TreeSet;

class Main {

    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 1; i <= 30; i++) {
            ts.add(i);
        }
        for (int i = 0; i < 28; i++) {
            int A = Integer.parseInt(br.readLine());
            ts.remove(A);
        }
        for (int A : ts) {
            System.out.println(A);
        }
    }
}
