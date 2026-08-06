import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int groups = 1; 
        String prev = sc.next();
        for (int i = 1; i < n; i++){
            String curr = sc.next();
            if (!curr.equals(prev)){
                groups++;
            }
            prev = curr; 
        }
        System.out.println(groups); 
        sc.close();
    }
}