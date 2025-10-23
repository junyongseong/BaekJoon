import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A =Integer.parseInt(br.readLine());
        int B =Integer.parseInt(br.readLine());
        int C =Integer.parseInt(br.readLine());
        int[] count = new int[10];

        String mp= Integer.toString(A*B*C);
        for(int i=0; i<mp.length();i++){
            int num =mp.charAt(i)-'0';
            count[num]++;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}