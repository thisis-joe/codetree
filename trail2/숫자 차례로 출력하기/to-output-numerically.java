import java.util.*;
import java.io.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        asc(n);
        System.out.println();
        desc(n);
    }

    static void asc(int cnt){
        if(cnt==0) return;

        asc(cnt-1);

        System.out.print(cnt+" ");
    }
    static void desc(int cnt){
        if(cnt==0) return;

        System.out.print(cnt+" ");

        desc(cnt-1);
    }
}