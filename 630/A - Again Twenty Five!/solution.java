import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Use nextLong() because n can be up to 2 * 10^18
        if (scanner.hasNextLong()) {
            long n = scanner.nextLong();
            System.out.println(25);
        }
        
        scanner.close();
    }
}