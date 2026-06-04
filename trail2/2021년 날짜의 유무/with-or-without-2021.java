import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {
    static int m,d;

    static boolean isExists(int m,int d){
        //
        if(m<1 || m>12 || d<1 || d>31) return false;
        if(m==2){
            if(d>28) return false;
        }
        else if(m==4 || m==6 || m==9 || m==11){
            if(d>30) return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        d = sc.nextInt();
        
        if(isExists(m,d)){
            System.out.print("Yes");
            return;
        }
        else{
            System.out.print("No");
            return;
        }
    }
}