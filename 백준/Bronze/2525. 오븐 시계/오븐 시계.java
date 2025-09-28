import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str =br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");

        int hour = (Integer.parseInt(st.nextToken()));
        int minute = (Integer.parseInt(st.nextToken()));
        int addminute =(Integer.parseInt(br.readLine()));

        int A = hour*60 +minute +addminute;

        System.out.printf("%d %d",(A/60)%24,A%60);
    }
}