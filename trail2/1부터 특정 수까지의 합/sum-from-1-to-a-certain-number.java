import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = n%2==0? (1+n)*(n/2): (1+n)*(n/2)+(n/2+1);
        System.out.println(sum/10);
    }
}