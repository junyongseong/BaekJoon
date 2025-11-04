import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());//듣도 못한사람
        int M = Integer.parseInt(st.nextToken());//보도 못한사람
       
        //둘째 줄부터는 N개(for) 듯도못한사람이름
        //N+2째줄 부터는 보도 못한사람의 이름 즉 교집합을 구하고 수도 같이?
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();//듣보잡리스트
        int count =0;//듣보잡인원수
        for(int i=0;i<N;i++){
            // String dd= br.readLine();
            set.add(br.readLine());//듣도못함
        }
        for(int i=0;i<M;i++){
            String bb = br.readLine();//보도못한사람
            if(set.contains(bb)){
                list.add(bb);
                count++;
            }
        }
        Collections.sort(list);
        System.out.println(count);
        for(int i=0; i<count;i++){
            System.out.println(list.get(i));
        }

    }
}