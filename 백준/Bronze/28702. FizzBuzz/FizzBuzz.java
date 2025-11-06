import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int count =0;
        Boolean find = false;
        for(int i=0; i<3;i++){
            String str= br.readLine();
            //한글이 아니면 숫자 저장 F or B
            char FB =str.charAt(0);
            if(FB != 'F'&& FB !='B')
                count = Integer.parseInt(str);
                find =true;
            if(find)//찾은경우임
                count++;
        }
        if(count %3==0 &&count %5==0)
            System.out.println("FizzBuzz");
        else if(count %3 ==0)
            System.out.println("Fizz");
        else if(count % 5==0)
            System.out.println("Buzz");
        else
            System.out.println(count);
    }
}