import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int C=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) !=0)
                C++;
        }
        System.out.println(C);
    }
}