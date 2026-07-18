import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            boolean possible = true ;
            long need = 1;
            for (int i= 0; i<n -1; i++){
                if(a[i]< need){
                    possible = false;
                    break;
                }
                long extra = a[i] - need;
                a[i+1] += extra;
                need++;
            }
            if (possible && a[n-1]< need){
                possible = false;
            }
            System.out.println(possible ? "yes" : "no");
        }
        sc.close();
    }
}