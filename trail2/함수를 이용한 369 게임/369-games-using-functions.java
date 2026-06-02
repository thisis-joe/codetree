import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for(int i = a ; i <= b ; i++){
            if(i%3 == 0) {
                cnt++;
                continue;
            }
            for(char c : (i+"").toCharArray()){
                if(c=='3' || c=='6' || c=='9'){
                    cnt++;
                    break;
                }
            }
        } 

        System.out.print(cnt);
    }
}