import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[9];
        for(int i=0;i<9;i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        int B=A[0];
        int C=1;
        for(int i=0;i<9;i++){
            if(A[i]>B){
                B=A[i];
                C=i+1;
            }
        }
        System.out.println(B);
        System.out.println(C);
    }
}