
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        // 코드 작성
        /*초기 	사각형개수			점개수		검은점개수
        초기 		1		 	 4 =2*2			4
        1번		4=2*2		 9=3*3			5
        2번		16=4*4		  25	=5*5			16
        3번		64=8*8		81=9*9			56
        4번은?	256=16*16			289??
        5번은		1024=32*32	  1089=33*33


        25-9=16
        81-25=56


        1	9
        2	25
        3	81
        4	289
        5	1089

        (2*n+1)제곱2 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Double S = Math.pow(2, N);
        int result = (int) ((S + 1) * (S + 1));
        System.out.println(result);
    }
}
