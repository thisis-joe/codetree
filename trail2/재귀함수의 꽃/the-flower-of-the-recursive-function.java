import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    static void print(int cnt){
        if(cnt==0) return;

        System.out.print(cnt +" ");
        print(cnt-1);
        System.out.print(cnt +" ");
        
    }
}