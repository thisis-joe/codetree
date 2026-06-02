import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n%4==0){
            if(n%100 == 0 && n%400 !=0) {
                System.out.println("false");
                return;
            }
            System.out.println("true");
            return;
        }

        System.out.println("false");
    }
}