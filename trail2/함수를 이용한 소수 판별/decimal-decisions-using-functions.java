import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        boolean[] isPrime = new boolean[B+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;

        for(int p = 2; p * p <= B ; p++){
            if(isPrime[p]){
                for(int q = p * p ; q <= B ; q += p){
                    isPrime[q] = false;
                }
            }            
        }

        int sum = 0;
        for(int i = A ; i <= B; i++){
            if(isPrime[i]) sum+=i;
        }

        System.out.println(sum);
    }
}