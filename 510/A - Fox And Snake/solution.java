import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        for (int i = 1; i <= n; i++) {
 
            if (i % 2 == 1) {
                // Odd rows: all #
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            }
            else if (i % 4 == 2) {
                // Dots on left
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }
                System.out.print("#");
            }
            else {
                // Dots on right
                System.out.print("#");
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}