import java.io.*;

class Main {
    // public static void main(String[] args) throws IOException {
    //     // 코드 작성
    //     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    //     int L = Integer.parseInt(br.readLine());
    //     String str = br.readLine();
    //     int result =0;
    //     for(int i=0;i<L;i++){
    //         result +=(str.charAt(i)-'a'+1)* Math.pow(31, i);
    //     }
    //     System.out.println(result);
    // }
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long result =0;
        long r =1;
        for(int i=0;i<L;i++){
            int val =str.charAt(i)-'a'+1;
            result = (result + val *r )%1234567891;
            r= (r*31)%1234567891;
        }
        System.out.println(result);
    }
}