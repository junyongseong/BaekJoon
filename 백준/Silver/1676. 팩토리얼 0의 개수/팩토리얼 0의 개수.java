import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());

        // long sum=1; //팩토리얼은 수가 급격하게 커져서 직접 구하면 터진다
        //0이 나올때는 2* 5를 곱할떄 10이 생기므로 0이 하나 생김
        //2는 충분히 다수 즉 5의 개수를 구해야하는데 단순히 5뿐만 아니라 25는 5*5 *2 하면 100으로 2개 생김 
        int count =0;
        for(int i=5;i<=N;i*=5){
            count +=N/i;
        }

        // for(int i=res.length();i>=0; i--){
        //     if(res.charAt(i)=='0')
        //         count++;
        //     else
        //         break;
        // }
        System.out.println(count);
    }
}