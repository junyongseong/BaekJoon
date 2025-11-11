import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int index =0;//별표자리
        int sum=0;//합구할 곳
        //0제외하고 짝쉬일땐 그대로 홀수일때는 3이 추가
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == '*')
                index =i;
            else
                sum += (i%2==0?1:3)* (str.charAt(i)-'0');//정수
        }
        //이제 (sum +1or 3 *x )%10 eq 0
        for(int x=0; x<=9;x++){
            int or = (index %2 ==0?1:3);
            if((sum+or*x)%10==0){
                System.out.println(x);
                break;
            }
        }

    }
}