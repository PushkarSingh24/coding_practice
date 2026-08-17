import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> freq = new HashMap<>();
            int sum = 0;
            int maxFreq = 0;
            int mostFrequentValue = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                int count = freq.getOrDefault(a[i], 0) + 1;
                freq.put(a[i], count);
                if (count > maxFreq) {
                    maxFreq = count;
                    mostFrequentValue = a[i];
                }
            }
            int otherCount = n - maxFreq;
            if (maxFreq <= otherCount + 1) {
                System.out.println(sum);
            } else {
                int answer = sum;
                int extra = maxFreq - (otherCount + 2);
                if (extra > 0) {
                    answer -= extra * mostFrequentValue;
                }
                System.out.println(answer);
            }
        }
        sc.close();
    }
}