import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        /*
         * 햄부기 찾기
         * 일단 문제 보기
            8개 밥그릇 4행 2열 // 2차원 배열[4][2]
            기술 A : 1행 1열,1행 2열, 2행 1열, 2행 2열
            <->     3행 1열, 3행 2열,4행 1열, 4행 2열
            기술 B : 1행 1열 <-> 2행 2열, 2행 1열 <->1행 2열
                    3행 1열 <-> 4행 2열, 3행 2열 <-> 4행 1열
            기술 C : 1행 1열 <-> 4행 2열, 1행 2열 <-> 4행 1열
                    2행 1열 <-> 3행 2열, 2행 2열 <-> 3행 1열
            기술 D : 1행 1열->1행 2열-> 2행2열->3행 2열 ->4행2열
                    -> 4행 1열 ->3행 1열 -> 2행 1열 -> 1행 1열
         */
        /*  이제 규칙 찾기
         *  기술 A : 1,2행이 단순히 3 4행과 바뀌는거니
         *  1,2행에+2 3,4행에 -2 하면 끝 바꾸는거니 임시배열 만들어서 swap
         *  기술 B: 1,2행끼리 3,4행끼리 대각선으로 바뀜
         */

        // 밥그릇 초기 상태
        int[][] arr = {
            {1,2},
            {3,4},
            {5,6},
            {7,8}
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()) - 1; // 밥그릇 숨긴 N행
        int M = Integer.parseInt(st.nextToken()) - 1; // 밥그릇 숨긴 M열

        int K = Integer.parseInt(br.readLine()); // 실행 횟수 K
        String S = br.readLine().trim(); // 세 번째 줄 길이 K의

        // 햄버거 위치 추적
        int burgerRow = N + 1; 
        int burgerCol = M + 1; 

        // 문자열로 기술 수행
        for (int i = 0; i < K; i++) {
            char c = S.charAt(i);
            if (c == 'A') {
                skillA(arr);
                // 햄버거 위치 업데이트: 1,2행 <-> 3,4행
                if (burgerRow == 1) burgerRow = 3;
                else if (burgerRow == 2) burgerRow = 4;
                else if (burgerRow == 3) burgerRow = 1;
                else if (burgerRow == 4) burgerRow = 2;
            }
            else if (c == 'B') {
                skillB(arr);
                // 햄버거 위치 업데이트트트
                if (burgerRow == 1 && burgerCol == 1) { burgerRow = 2; burgerCol = 2; }
                else if (burgerRow == 1 && burgerCol == 2) { burgerRow = 2; burgerCol = 1; }
                else if (burgerRow == 2 && burgerCol == 1) { burgerRow = 1; burgerCol = 2; }
                else if (burgerRow == 2 && burgerCol == 2) { burgerRow = 1; burgerCol = 1; }
                else if (burgerRow == 3 && burgerCol == 1) { burgerRow = 4; burgerCol = 2; }
                else if (burgerRow == 3 && burgerCol == 2) { burgerRow = 4; burgerCol = 1; }
                else if (burgerRow == 4 && burgerCol == 1) { burgerRow = 3; burgerCol = 2; }
                else if (burgerRow == 4 && burgerCol == 2) { burgerRow = 3; burgerCol = 1; }
            }
            else if (c == 'C') {
                skillC(arr);
                // 햄버거 위치 업데이트
                if (burgerRow == 1 && burgerCol == 1) { burgerRow = 4; burgerCol = 2; }
                else if (burgerRow == 1 && burgerCol == 2) { burgerRow = 4; burgerCol = 1; }
                else if (burgerRow == 2 && burgerCol == 1) { burgerRow = 3; burgerCol = 2; }
                else if (burgerRow == 2 && burgerCol == 2) { burgerRow = 3; burgerCol = 1; }
                else if (burgerRow == 3 && burgerCol == 1) { burgerRow = 2; burgerCol = 2; }
                else if (burgerRow == 3 && burgerCol == 2) { burgerRow = 2; burgerCol = 1; }
                else if (burgerRow == 4 && burgerCol == 1) { burgerRow = 1; burgerCol = 2; }
                else if (burgerRow == 4 && burgerCol == 2) { burgerRow = 1; burgerCol = 1; }
            }
            else if (c == 'D') {
                skillD(arr);
                // 햄버거 위치 업데이트
                if (burgerRow == 1 && burgerCol == 1) { burgerRow = 1; burgerCol = 2; }
                else if (burgerRow == 1 && burgerCol == 2) { burgerRow = 2; burgerCol = 2; }
                else if (burgerRow == 2 && burgerCol == 2) { burgerRow = 3; burgerCol = 2; }
                else if (burgerRow == 3 && burgerCol == 2) { burgerRow = 4; burgerCol = 2; }
                else if (burgerRow == 4 && burgerCol == 2) { burgerRow = 4; burgerCol = 1; }
                else if (burgerRow == 4 && burgerCol == 1) { burgerRow = 3; burgerCol = 1; }
                else if (burgerRow == 3 && burgerCol == 1) { burgerRow = 2; burgerCol = 1; }
                else if (burgerRow == 2 && burgerCol == 1) { burgerRow = 1; burgerCol = 1; }
            }
        }

        // 최종 햄버거 위치
        System.out.println(burgerRow + " " + burgerCol);
    }

    // 기술 A
    static void skillA(int[][] arr) {
        for (int i = 0; i < 2; i++) { // 0,1 위쪽 두 행만 하면 아래도 바뀜
            int[] temp = arr[i]; // 임시 저장배열 행만 바꾸면 되니 1차원
            arr[i] = arr[i + 2];
            arr[i + 2] = temp;
        } // 기술 A 완
    }

    static void swap(int[][] arr, int a1, int b1, int a2, int b2) {
        int temp = arr[a1][b1];
        arr[a1][b1] = arr[a2][b2];
        arr[a2][b2] = temp;
    }

    // 기술 B
    static void skillB(int[][] arr) {
        // 1,2행끼리 하고
        swap(arr, 0, 0, 1, 1);
        swap(arr, 0, 1, 1, 0);
        // 이제 3,4행
        swap(arr, 2, 0, 3, 1);
        swap(arr, 2, 1, 3, 0);
    }

    // 기술 C
    static void skillC(int[][] arr) {
        // 1,4행 바뀌는거
        swap(arr, 0, 0, 3, 1);
        swap(arr, 0, 1, 3, 0);
        // 2,3행 바뀌는거
        swap(arr, 1, 0, 2, 1);
        swap(arr, 1, 1, 2, 0);
    }

    // 기술 D 
    static void skillD(int[][] arr) {
        int temp = arr[0][0]; // 임시 저장 2차원 배열

        arr[0][0] = arr[1][0];
        arr[1][0] = arr[2][0];
        arr[2][0] = arr[3][0];
        arr[3][0] = arr[3][1];
        arr[3][1] = arr[2][1];
        arr[2][1] = arr[1][1];
        arr[1][1] = arr[0][1];
        arr[0][1] = temp;
    }
}
