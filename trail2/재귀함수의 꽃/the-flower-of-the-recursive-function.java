import java.util.Scanner;
public class Main {
    static int n;
    static boolean flag;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        flag = true;

        print(n);
    }

    static void print(int cnt){
        if(cnt==1 && flag == true){
            System.out.print(cnt+" ");
            flag = false;
        }
        if(cnt==n+1 && flag == false){
            return;
        }
        if(flag){
            System.out.print(cnt+" ");
            print(cnt-1);
        }
        else{
            System.out.print(cnt+" ");
            print(cnt+1);
        }

    }
}