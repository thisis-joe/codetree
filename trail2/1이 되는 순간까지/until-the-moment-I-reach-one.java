import java.util.*;
import java.io.*;
public class Main {
    static int n,cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        recur(n);

        System.out.println(cnt);
    }

    static void recur(int num){
        if(num==1) return;
        if(num%2==0) {
            num /= 2;
            cnt++;
        }
        else {
            num = num/3;
            cnt++;
        }

        recur(num);
    }
}