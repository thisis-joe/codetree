import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = (n % 2 == 0) && ((n / 10 + n % 10) % 5 == 0) 
                    ? "Yes" : "No";
        System.out.println(str);
    }
}