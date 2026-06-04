import java.util.*;
import java.io.*;
public class Main {
    static int n, arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if(n==1) {
            System.out.print(arr[0]);
            return;
        }
        
        System.out.print(recur(0)); 
        return;
    }

    static int recur(int idx){
        if(idx==n-2) return (int)Math.max(arr[n-2],arr[n-1]);
        return (int)Math.max(arr[idx],recur(idx+1));
    }
}