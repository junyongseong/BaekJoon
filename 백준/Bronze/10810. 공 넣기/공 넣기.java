import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());//바구니
        int B = Integer.parseInt(st.nextToken());//공
        int N[] = new int[A];//바구니 배열

        for(int a=0; a<B;a++){
            st = new StringTokenizer(br.readLine()," ");
            int i= Integer.parseInt(st.nextToken());
            int j= Integer.parseInt(st.nextToken());
            int k= Integer.parseInt(st.nextToken());
            for(int x=i-1; x<j;x++){
                N[x]=k;
            }
        }

        for(int x=0;x<A;x++){
            System.out.print(N[x]+" ");
        }
    }
}