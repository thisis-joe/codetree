
import java.util.*;
import java.io.*;
public class Main {
    static int A,B,C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        long D = (long)A*B*C;

        long ans = recur(D);

        System.out.print(ans);
    }

    static long recur(long num){
        if(num==0) return 0;
        return num%10 + recur(num/10);
    }
}