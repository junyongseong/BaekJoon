import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int A = (Integer.parseInt(str));

        if(A%4==0 && A%100 !=0 || A%400==0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}