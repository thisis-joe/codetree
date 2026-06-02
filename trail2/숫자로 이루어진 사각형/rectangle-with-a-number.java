import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        print(n);
        return;
    }
    
    static void print(int n){
        int num=1;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(num>=10) num=1;
                System.out.print(num+++" ");
            }
            System.out.println();
        }
    }
}