import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb= new StringBuffer();
        Set<Integer> set= new HashSet<>(); //여따가 저장
        int T = Integer.parseInt(br.readLine());//테케
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int result = 0;
            switch (str){
                case "add":
                    set.add(Integer.parseInt(st.nextToken()));
                    break;
                case "remove":
                    set.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "check":
                    result = Integer.parseInt(st.nextToken());
                    if(set.contains(result))
                        sb.append(1);
                    else
                        sb.append(0);
                    sb.append("\n");
                    break;
                case "toggle" :
                    result = Integer.parseInt(st.nextToken());
                    if(set.contains(result))
                        set.remove(result);
                    else
                        set.add(result);
                    break;
                case "all":
                    set = new HashSet<>();
                    for(int j=1;j<=20;j++)
                        set.add(j);
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}