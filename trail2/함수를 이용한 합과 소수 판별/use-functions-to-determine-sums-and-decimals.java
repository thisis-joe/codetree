import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       
        boolean[] isPrime = new boolean[b+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i <= (int)Math.sqrt(b); i++){

            

            for(int j = i*i ; j <= b; j+=i ){
                isPrime[j] = false;
            }
        }
        //
        int cnt = 0;
        for(int i = a ; i<=b ; i++){
            if(isPrime[i]){
                int num = i;
                int sum = 0;
                while(num>0){
                    sum += num%10;
                    num /=10;
                }
                if(sum%2==0) cnt++;
            }
        }

        System.out.println(cnt);
    }
}