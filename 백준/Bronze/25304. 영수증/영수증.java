import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int chonguemaek =Integer.parseInt(br.readLine());
        int su =Integer.parseInt(br.readLine());

        int hap = 0;
        for(int i=0; i<su;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int A =Integer.parseInt(st.nextToken());
            int B =Integer.parseInt(st.nextToken());
            hap+=A*B;
        }
        if (chonguemaek==hap) {
            System.out.print("Yes");
        }else
            System.out.println("No");
    }
}