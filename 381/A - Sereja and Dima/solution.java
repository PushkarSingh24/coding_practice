import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 
        int left = 0;
        int right = n - 1;
        int ssum = 0;
        int dsum = 0;
 
        for (int i = 0; i < n; i++) {
            if (arr[left] > arr[right]) {
                if (i % 2 == 0) {
                    ssum += arr[left];
                } else {
                    dsum += arr[left];
                }
                left++;
            } else {
                if (i % 2 == 0) {
                    ssum += arr[right];
                } else {
                    dsum += arr[right];
                }
                right--;
            }
        }
 
        System.out.println(ssum + " " + dsum);
 
        sc.close();
    }
}