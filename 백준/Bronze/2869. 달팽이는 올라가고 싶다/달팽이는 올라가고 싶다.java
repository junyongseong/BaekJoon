import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());//올라가는 정도
        int B = Integer.parseInt(st.nextToken());//내려가는 정도
        int V = Integer.parseInt(st.nextToken());//최종 높이
       
        int count = (V-B)/(A-B);
        if ((V - B) % (A - B) != 0)//남은게 있을경우에
			count++;
		
        System.out.println(count);
    }
}