import java.util.*;
import java.io.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        print(1);
    }

    static void print(int cnt){
        if(cnt==n+1) return;

        for(int i = 0 ; i < cnt ; i++){
            System.out.print("*");
        }
        System.out.println();
        print(cnt+1);
        
    }
}