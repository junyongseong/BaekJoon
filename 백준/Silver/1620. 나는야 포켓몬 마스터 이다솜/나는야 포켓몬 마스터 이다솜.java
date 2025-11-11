import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N= Integer.parseInt(st.nextToken());//N개의 포켓몬 번호
        int M= Integer.parseInt(st.nextToken());//맞춰야할 문제수

        String[] poketmonar = new String[N];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            poketmonar[i] = br.readLine();//포켓몬 배열 생성 완료
            map.put(poketmonar[i], i+1);//이름 들어올때 번호
        }
        for(int i=0; i<M;i++){
            String input = br.readLine();//들어온것
            try {//숫자 들어올
                int A =Integer.parseInt(input);
                System.out.println(poketmonar[A-1]);
            } catch (Exception e) {//이름 들어올떄
                System.out.println(map.get(input));
            }
        }
    }
}