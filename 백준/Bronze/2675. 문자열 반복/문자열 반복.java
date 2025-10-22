import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T =Integer.parseInt(br.readLine()); //테스트 케이수 수
        // String[] S = new String[T];
        for(int i =0; i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int R = Integer.parseInt(st.nextToken()); //반복수
            String S = st.nextToken();//문자열
            //sb로 쌓아서 한번에 출력?

            StringBuilder sb = new StringBuilder();
            for(char c:S.toCharArray()){ //향상된 for문
                for (int j=0;j<R;j++){
                    sb.append(c);
                }
            }
            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}