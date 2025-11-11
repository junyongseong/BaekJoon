import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        //앞뒤가 똑같은 펠린드롬~
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String A = br.readLine();
            boolean chk=true;
            if (A.equals("0"))
                    break;
            for (int i = 0; i < A.length()/2; i++) {
                    if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
                        chk=false;
                        break;
                }
            }
            if (chk)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}