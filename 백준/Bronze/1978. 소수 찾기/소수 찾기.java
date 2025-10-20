import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int C=0;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if(sosu(num)){
                C++;
            }          
        }
        System.out.println(C);
    }

    public static boolean sosu(int num){

        if(num ==1)
            return false;
        for (int i=2; i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}