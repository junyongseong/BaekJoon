import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int A =Integer.parseInt(br.readLine());

        int B= A/4;

        for(int i=0;i<B;i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}