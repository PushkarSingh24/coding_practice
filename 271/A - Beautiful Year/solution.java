import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int year = sc.nextInt();
 
        while (true) {
            year++;
 
            int d1 = year / 1000;
            int d2 = (year / 100) % 10;
            int d3 = (year / 10) % 10;
            int d4 = year % 10;
 
            if (d1 != d2 && d1 != d3 && d1 != d4 &&
                d2 != d3 && d2 != d4 &&
                d3 != d4) {
                System.out.println(year);
                break;
            }
        }
 
        sc.close();
    }
}