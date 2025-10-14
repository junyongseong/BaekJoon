import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());//바구니 개수
        int B = Integer.parseInt(st.nextToken());//바꿀 수
        int N[] = new int[A];//바구니 배열
        for(int i=0;i<A;i++){
            N[i] =i+1;
        }
        for(int i=0;i<B;i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            for(int j=0;j<(b-a+1)/2;j++){
                int temp;
                temp =N[a-1+j];
                N[a-1+j] =N[b-1-j];
                N[b-1-j]=temp;
            }
        }
        for(int i=0;i<A;i++){
            System.out.print(N[i]+" ");
        }
    }
}