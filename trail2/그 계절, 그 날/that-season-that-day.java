import java.util.Scanner;
public class Main {
    static int y,m,d;

    static String getSeason(int m){
        if(m>=3 && m<=5) return "Spring";
        else if(m >=6 && m <=8) return "Summer";
        else if(m >=9 && m <= 11) return "Fall";
        else return "Winter";
    }

    static boolean isExists(int y, int m, int d){
        if(m <= 12 && d <= getMaxDayOfMonth(y,m)){
            return true;
        }
        return false;
    }

    static int getMaxDayOfMonth(int y, int m){

        if(m == 2){
            if(isLeapYear(y)) return 29;
            return 28;
        }
        if(m == 4 || m == 6 || m == 9 || m == 11){
            return 30;
        }

        return 31;
    }
    static boolean isLeapYear(int y){
        if(y%4==0){
            if(y%400 == 0) return true;
            if(y%100 == 0) return false;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(isExists(y,m,d)){
            System.out.print(getSeason(m));
        }
        else{
            System.out.print(-1);
        }
    }
}