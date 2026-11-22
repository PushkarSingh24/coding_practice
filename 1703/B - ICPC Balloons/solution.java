import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int[] visited = new int[26];
            int balloons = 0;
 
            for (int i = 0; i < n; i++) {
                int index = s.charAt(i) - 'A';
 
                if (visited[index] == 0) {
                    balloons += 2;
                    visited[index] = 1;
                } else {
                    balloons += 1;
                }
            }
 
            System.out.println(balloons);
        }
 
        sc.close();
    }
}