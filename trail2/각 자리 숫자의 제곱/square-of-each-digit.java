import java.util.*;
import java.io.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int ans = recur(n);

        System.out.println(ans);
    }

    static int recur(int num){
        if(num == 0) return 0;
        return (int)Math.pow(num % 10,2) + recur(num/10);
    }
}