import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int[] ar= new int[26];
        for(int i=0;i<26;i++){
            ar[i]=-1;
        }

        for(int i=0;i<S.length();i++){
            char A =S.charAt(i);

            if(ar[A-'a']==-1)
                ar[A-'a']=i;
        }
        for(int i:ar)
            System.out.print(i+" ");
    }
}