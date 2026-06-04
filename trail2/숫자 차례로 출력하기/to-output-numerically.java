import java.util.*;
import java.io.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        print1(1);
        System.out.println();
        print2(n);
    }

    static void print1(int cnt){
        if(cnt==n+1) return;

        System.out.print(cnt+" ");

        print1(cnt+1);
    }
    static void print2(int cnt){
        if(cnt==0) return;

        System.out.print(cnt+" ");

        print2(cnt-1);
    }
}