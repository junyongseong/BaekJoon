import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T=Integer.parseInt(br.readLine());//테케
        String str[] = new String[T];

        for(int i=0;i<T;i++){
            str[i] =br.readLine();
        }
        for(int i=0;i<T;i++){
            int count=0;
            int sum=0;

            for(int j=0; j<str[i].length();j++){
                if(str[i].charAt(j)=='O')
                    count++;
                else
                    count =0;//초기화

                sum +=count;
            }
            sb.append(sum).append("\n");
        }

System.out.println(sb);
    }
}