import java.util.*;
import java.io.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int ans = fib(n);
        System.out.println(ans);

    }

    static int fib(int num){
        if(num == 1 || num == 2){
            return 1;
        } 
        return fib(num-1) + fib(num-2);
    }
}