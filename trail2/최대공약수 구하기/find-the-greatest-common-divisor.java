import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n<m){
            int tmp = n;
            n = m;
            m = tmp;
        }
        System.out.println(gcd(n,m));
    }

    static int gcd(int n, int m){
        if(n%m==0){
            return m;
        }
        return gcd(n,n%m);
    }
}