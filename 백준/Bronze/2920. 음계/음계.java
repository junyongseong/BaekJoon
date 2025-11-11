import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] ar = new int[8];
        String result = "";
        for(int i=0; i<8;i++){
            ar[i]= Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<7;i++){
            if(ar[i]+1==ar[i+1]){
                result ="ascending";
            }else if(ar[i]-1==ar[i+1]){
                result ="descending";
            }else{
                result ="mixed";
                break;
            }
        }
        System.out.println(result);
    }
}