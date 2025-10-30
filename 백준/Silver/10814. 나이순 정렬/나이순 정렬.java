import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static class Member{
        int age;
        String name;

        Member(int age,String name){
            this.age= age;
            this.name= name;
        }
    }
    public static void main(String[] args) throws IOException {
        // 코드 작성
        //기준 1 나이 기준 2 입력 순서대로 stable sort? 팀소트가 정렬함
        //1차원 배열로 하면 따로 놈 Object로 만들어서 한번에 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());//테케

        Member[] members = new Member[N];
        for(int i =0; i<N;i++){
            StringTokenizer st =  new StringTokenizer(br.readLine()," ");
            int age= Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members[i] = new Member(age,name);
        }
        Arrays.sort(members,(a,b)->a.age-b.age);//오름차순 a.age<b.age면 a를 앞으로 
        //이름을 사전순으로 할거면 (a,b) -> a.name.compareTo(b.name) 이런식으로

        for(Member m:members){
            sb.append(m.age).append(" ").append(m.name).append("\n");
        }
        System.out.println(sb);
    }
}