import java.util.*;
import java.io.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        print(0);
        return;
    }

    static void print(int cnt){
        if(cnt == n){
            return;
        }
        System.out.println("HelloWorld");
        print(cnt+1);
    }
}