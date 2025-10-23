
import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());//반복할 횟수 N
        int M = Integer.parseInt(st.nextToken());//가장가까운 수의 기준이 되는 M
        int[] ar = new int[N];//2번째 줄에 입력한 값들을 배열에 담아 저장
        
        int result = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        //3장이니 반복문을 다 돌려서 합을 구해자
        //첫번째 카드는 첫번째부터 시작한다 가정하면 두번째카드는 2번째 장 세번째 카드는
        //세번째 장부터 시작하면 되고 마지막장도 읽을 필요 없게 되니 -2 -1 로 해준다.
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                // for (int k = i + 2; k < N; k++) { i+2로 하면 안돔 j가 바뀌어도 고정됨
                for (int k = j + 1; k < N; k++) {
                    int sum = ar[i] + ar[j] + ar[k];
                    //이제 sum 값을 비교해줘야함 sum은 M보다 작으며 결과값보다 크면 안됨
                    if(sum <=M && sum>result)
                        result = sum;
                }
            }
        }
            System.out.println(result);
        

    }
}
