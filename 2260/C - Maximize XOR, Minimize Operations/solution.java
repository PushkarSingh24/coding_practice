import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int qrTNum = Integer.parseInt(br.readLine());
        StringBuilder out = new StringBuilder();
        while (qrTNum-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long s = x + y;
            long best = x;
            if ((x & ~s) != 0) {
                for (int bit = 30; bit >= 0; bit--) {
                    long mask = 1L << bit;
                    if ((x & mask) != 0 && (s & mask) == 0) {
                        long upper = x & ~((1L << (bit + 1)) - 1);
                        long lower = s & ((1L << bit) - 1);
                        best = upper | lower;
                        break;
                    }
                }
            }
            long operations = x - best;
            out.append(s).append(" ").append(operations).append('
');
        }
        System.out.print(out);
    }
}