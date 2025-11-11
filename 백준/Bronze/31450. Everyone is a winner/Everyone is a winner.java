import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        if(Integer.parseInt(st.nextToken())%Integer.parseInt(st.nextToken())==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}