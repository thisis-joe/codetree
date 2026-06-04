import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        if(s1.contains(s2)){
            System.out.print(s1.indexOf(s2));
            return;
        }
        System.out.print("-1");
    }
}