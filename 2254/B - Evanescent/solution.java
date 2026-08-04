import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            // Count initial number of groups
            int groups = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    groups++;
                }
            }
 
            int ans = groups;
 
            // Try deleting each valid position
            for (int i = 1; i <= n - 2; i++) {
                int cur = groups;
 
                char left = s.charAt(i - 1);
                char mid = s.charAt(i);
                char right = s.charAt(i + 1);
 
                if (left == right && mid != left) {
                    cur -= 2;
                } else if (mid != left && mid != right && left != right) {
                    cur -= 1;
                }
 
                ans = Math.min(ans, cur);
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}