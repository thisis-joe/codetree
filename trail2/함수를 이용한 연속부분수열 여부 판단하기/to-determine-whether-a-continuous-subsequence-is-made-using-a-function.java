import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        
        //
        for(int s = 0 ; s < n1; s++){

            if(a[s] != b[0]) continue;

            int bEndIdx = 0;

            for(int e=s; e<s+n2; e++){
                if(a[e]!=b[bEndIdx++]) break;

                if(a[e]==b[n2-1]){
                    System.out.print("Yes");
                    return;
                }
            
            }
        }
        System.out.print("No");
        return;
    }
}