import java.util.*;
import java.io.*;

public class Main {
    static int n, arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lcm = arr[0];
        for(int i = 1; i < n ; i++){
            lcm = arr[i-1] * arr[i] / gcd(arr[i-1],arr[i]);
            arr[i] = lcm;
        }

        System.out.print(lcm);

    }

    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}