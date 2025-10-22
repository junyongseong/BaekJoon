import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int C =0; //수
        int room=1;
        if (N==1){
            C=1;
            System.out.println(C);
        }
        else{
            while(room<N){
                room = room+ C*6;
                C++;
            }
            System.out.println(C);
        }

    }
}