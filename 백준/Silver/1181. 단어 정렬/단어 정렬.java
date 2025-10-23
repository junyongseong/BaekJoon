import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        String[] str = new String[N];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N; i++){
            str[i]= br.readLine();
        }//배열에 일단 담기
        //1단계 길이 비교 2단게 순서비교
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String str1,String str2){
                //먼지 길이가 같은경우
                if(str1.length()==str2.length()){
                    return str1.compareTo(str2);
                }else
                    return str1.length()-str2.length();
            }
        });
        sb.append(str[0]).append('\n');
        //중복 제거해야함
        for(int i =1;i<N;i++){
            if(!str[i].equals(str[i-1]))
                sb.append(str[i]).append('\n');
        }
        System.out.println(sb);
    }
}