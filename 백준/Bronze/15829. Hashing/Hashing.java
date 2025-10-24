import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int result =0;
        for(int i=0;i<L;i++){
            result +=(str.charAt(i)-'a'+1)* Math.pow(31, i);
        }
        System.out.println(result);
    }
}