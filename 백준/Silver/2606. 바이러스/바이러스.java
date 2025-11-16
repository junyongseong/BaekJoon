import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int node,line;//노드와 간선
    static int[][] arr;//담을 2차원 배열
    static int count=0;//숫자
    static boolean chk[];//체크할 배열

    static Queue<Integer> list = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());//컴퓨터 갯수(간선)
        line = Integer.parseInt(br.readLine());// 몇쌍인지(노듣)

        arr = new int[node+1][node+1];
		chk = new boolean[node+1];
        for(int i=0; i<line;i++){
            StringTokenizer st = new  StringTokenizer(br.readLine()," " );
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());

            arr[a][b]=arr[b][a]=1;//a와 b가 바뀌어도 결과는 같음
            
        }
        dfs(1);
        System.out.println(count);
    }
    public static void dfs(int i){
        chk[i] =true;
        for(int j=0;j<=node;j++){
            if(arr[i][j]==1 && !chk[j]){
                count++;
                dfs(j);
            }

        }
    }
}