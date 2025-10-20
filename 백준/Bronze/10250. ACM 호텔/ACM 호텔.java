import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
       StringBuilder sb= new StringBuilder();
        // int X,Y;
        // if(N%H==0) //0일때를 가정 ex) 3 3일떄 3층
        //     Y=H*100;
        // else
        //     Y= N %H *100;
        
        // if(N%H==0)
        //     X = N/H;
        // else
        //     X= N/H +1;
        for(int i =0; i<A; i++){
             StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int H = Integer.parseInt(st.nextToken());//호텔의 층수
        int W = Integer.parseInt(st.nextToken());// 각 층의 방수
        int N = Integer.parseInt(st.nextToken());//몇번째 손님인지

        if(N%H==0){
            sb.append((H*100)+(N/H)).append("\n");
        }
        else{
            sb.append(((N%H)*100) +((N/H)+1)).append("\n");
        }
        }
        System.out.println(sb);
    }
}