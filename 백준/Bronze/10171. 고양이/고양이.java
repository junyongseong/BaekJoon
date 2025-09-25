import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\\    /\\");
        bw.newLine();
        bw.write(" )  ( ')");
        bw.newLine();
        bw.write("(  /  )");
        bw.newLine();
        bw.write(" \\(__)|");
        bw.newLine();

        bw.flush();
    }
}