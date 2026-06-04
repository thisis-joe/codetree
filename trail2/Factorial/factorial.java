import java.util.*;
import java.io.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        System.out.print(fact(n));
    }

    static int fact(int num){
        if(num == 1) return 1;
        return num * fact(num-1);
    }
}
