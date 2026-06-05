import java.util.*;
import java.io.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        System.out.println(recur(n));
    }

    static int recur(int cnt){
        if(cnt==2) return 4;
        if(cnt==1) return 2;

        return (recur(cnt-1) * recur(cnt-2)) % 100;
    }
}