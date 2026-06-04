import java.util.Scanner;
public class Main {

    static int n1,n2,a[],b[];

    static boolean isSame(int n){
        for(int s = 0 ; s < n2; s++){
            if(a[s + n] != b[s]){
                return false;
            }
        }
        return true;
    }

    static boolean isSubsequence(){
        for(int i = 0 ; i <= n1-n2; i++){
            if(isSame(i)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        a = new int[n1];
        b = new int[n2];
        
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        
       if(isSubsequence()){
        System.out.print("Yes");
        return;
       }
       else{
        System.out.print("No");
        return;
       }
    }
}