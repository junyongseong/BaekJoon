import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        
        int result=0; //결과 담을곳

        //각 자릿수마다 더하기?
        for(int i=0; i<A;i++){
            int Number=i;//i와 같이
            int sum =0;//합 담을곳
            
            while (Number!=0) {//i가 0이 아닐때 까지
                sum +=Number%10;
                Number=Number/10;
            }

            //생성자를 찾았을 경우에
            if(sum+i==A){
                result=i;
                break;
            }
        }
        System.out.println(result);
    }
}