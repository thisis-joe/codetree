import java.util.*;
import java.io.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int ans = n % 2 == 0 ? sumE(n) : sumO(n);

        System.out.print(ans);
    }

    static int sumE(int num){
        if(num == 2) return 2;
        return num + sumE(num-2);
    }

    static int sumO(int num){
        if(num == 1) return 1;
        return num + sumO(num-2);
    }
}