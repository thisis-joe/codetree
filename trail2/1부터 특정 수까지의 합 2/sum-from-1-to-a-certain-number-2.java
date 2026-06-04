import java.util.*;
import java.io.*;
public class Main {
    static int sum,n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        sum = recur(1);

        System.out.println(sum);
    }

    static int recur(int num){
        if(num==n) return n;
        return num + recur(num+1);
    }
}