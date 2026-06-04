import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        print(n);
        return;
    }

    static void print(int cnt){
        if(cnt==0) return;
        for(int i = 0 ; i < cnt ; i++){
            System.out.print("* ");
        }
        System.out.println();
        print(cnt-1);
        for(int i = 0 ; i < cnt ; i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}