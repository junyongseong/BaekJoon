import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A =Integer.parseInt(br.readLine());

        for(int i=0;i<A;i++){
            for(int y=A; y>i+1; y-- ){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}