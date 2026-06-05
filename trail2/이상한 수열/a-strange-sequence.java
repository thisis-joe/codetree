import java.util.*;
import java.io.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        System.out.print(recur(n));
    }

    static int recur(int num){
        if(num==2) return 2;
        if(num==1) return 1;

        return recur((int)Math.floor(num/3)) + (recur(num-1));
    }
}
