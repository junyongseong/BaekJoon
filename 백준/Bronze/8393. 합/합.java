import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int A =Integer.parseInt(br.readLine());
    int hap=0;
    for(int i=1;i<=A;i++){
        hap +=i;
    }
    System.out.print(hap);
    }
}